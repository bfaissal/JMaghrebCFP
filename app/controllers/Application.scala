package controllers

import play.api.mvc._
import com.mongodb.casbah.Imports._
import _root_.util.{CFPUtil, MailUtil, DBUtil}

import play.api.libs.json._
import play.api.i18n.Messages.Message
import play.api.i18n.Messages
import java.util.{UUID, Calendar}
import play.api.Play
import java.io.{FileInputStream, FileOutputStream, FileNotFoundException, File}
import play.api.libs.json.JsObject

object Application extends Controller {

  def index = Action {
    implicit request =>
      if (session.get("name") == None)
        Ok(views.html.index("JMaghre CFP"))
      else
        Redirect("/go")
  }

  def go = Action {
    implicit request => {
      session.get("name").map {
        _ => Ok(views.html.go("JMaghre CFP"))
      }.getOrElse(Redirect("/"))
    }
  }

  def profile = Action {
    implicit request => {
      session.get("name").map {
        _ => Ok(views.html.profile("JMaghre CFP"))
      }.getOrElse(Redirect("/"))
    }
  }

  def login = Action {
    implicit request =>
      try {
        request.body.asJson.map {
          json => {
            println("pass " + (json \ "password").as[String])
            println("un " + (json \ "_id").as[String])
            val query = MongoDBObject("_id" -> (json \ "_id").as[String]) ++ ("password" -> (json \ "password").as[String]) ++ ("actif" -> 1)
            Ok("{}").withSession("name" -> (json \ "_id").as[String]).as(JSON)

          }
        }.getOrElse(BadRequest("Error"))
      }
      catch {
        case e: Exception => BadRequest("Please enter a valid username/password !");
      }
  }

  def changePassword(email: String, code: String) = Action {
    implicit request =>
      try {
        val query = MongoDBObject("_id" -> email) ++ ("resetCode" -> code)
        DBUtil.speakers.findOne(query).map {
          DBUtil.speakers.update(query, $unset("resetCode"))
          res => Ok(views.html.password("JMaghre CFP")).withSession(session + ("name" -> email))
        }.getOrElse(BadRequest(";)"))
      }
      catch {
        case e => e.printStackTrace(); BadRequest("Please enter a valid activation code !")
      }
  }

  def resetPassword = Action {
    implicit request => {
      request.body.asJson.map {
        json => {
          try {
            val randomCode = CFPUtil.randomString()
            val query = MongoDBObject("_id" -> (json \ "_id").as[String])
            DBUtil.speakers.update(query, $set(("resetCode" -> randomCode), ("resetTime" -> Calendar.getInstance().getTimeInMillis.toString)))
            MailUtil.send((json \ "_id").as[String], Messages("passwordreset.email.subject"), Messages("passwordreset.email.body", (json \ "_id").as[String], randomCode))
            Ok("{}")
          } catch {
            case e => e.printStackTrace(); BadRequest("");
          }
        }
      }.getOrElse(BadRequest("problem"))
    }
  }

  def logout = Action {
    implicit request =>
      Redirect("/").withNewSession
  }

  def getSpeaker = Action {
    implicit request =>
      Ok(DBUtil.speakers.find(MongoDBObject("_id" -> request.session.get("name"))).mkString(",")).as(JSON)
  }

  def activateSpeaker(email: String, code: String) = Action {
    try {
      val query = MongoDBObject("_id" -> email) ++ ("activationCode" -> code)
      if (DBUtil.speakers.update(query, $set("actif" -> 1)).getN > 0) Ok(views.html.index("JMaghre CFP"))
      else BadRequest("Please enter a valid activation code ! = " + code)
    }
    catch {
      case e => e.printStackTrace(); BadRequest("Please enter a valid activation code !")
    }
  }

  def createSpeaker() = Action {
    implicit request =>
      try {
        request.body.asJson.map {
          json => {
            val activationCode = CFPUtil.randomString()
            val resultJson = json match {
              case a: JsObject => a ++ Json.obj("activationCode" -> activationCode)
              case _ => JsNull
            }
            if ((json \ "_id").asOpt[String].isEmpty || (json \ "image").asOpt[String].isEmpty) BadRequest("username is empty")
            else {
              println("json = "+resultJson.toString())
              DBUtil.speakers += (com.mongodb.util.JSON.parse(resultJson.toString())
              match {
                case x: DBObject => x;
                case _ => throw new ClassCastException
              })
              val res = Messages("registration.email.body", (json \ "fname").as[String], (json \ "_id").as[String], activationCode)
              MailUtil.send((json \ "_id").as[String], Messages("registration.email.subject"), res, (json \ "fname").as[String])
              val image =  (json \ "image").asOpt[String].get
              val imgSrc = new File(System.getenv("TMPDIR")+image+".gif")
              val imgDest = new File(System.getenv("OPENSHIFT_DATA_DIR")+"images/" +image+".gif")
              new FileOutputStream(imgDest).getChannel().transferFrom(new FileInputStream(imgSrc).getChannel, 0, Long.MaxValue )
              imgSrc.delete()
              Ok("{}").as(JSON).withSession(session - "uploadedImage")
            }
          }
        }.getOrElse(BadRequest("Error"))
      }
      catch {
        case e => InternalServerError("{\"message\":\"Dublicate username ;)\",\"exception\":\"" + e.getMessage + "\"}").as(JSON)
      }
  }

  def editSpeaker() = Action {
    implicit request =>
      request.body.asJson.map {
        json => {
          if ((json \ "_id").asOpt[String].isEmpty) BadRequest("username is empty")
          else {
            try {
              DBUtil.speakers.update(MongoDBObject("_id" -> request.session.get("name")), com.mongodb.util.JSON.parse(json.toString())
              match {
                case x: DBObject => x;
                case _ => throw new ClassCastException
              })
              val image =  (json \ "image").asOpt[String].get
              val imgSrc = new File(System.getenv("TMPDIR")+image+".gif")
              val imgDest = new File(System.getenv("OPENSHIFT_DATA_DIR")+"images/" +image+".gif")
              new FileOutputStream(imgDest).getChannel().transferFrom(new FileInputStream(imgSrc).getChannel, 0, Long.MaxValue )
              imgSrc.delete()
              Ok(json).as(JSON)
            }
            catch {
              case e => e.printStackTrace();InternalServerError("{\"message\":\"Dublicate username \"}").as(JSON)
            }
          }
        }
      }.getOrElse(BadRequest("Error"))
  }

  def upload = Action(parse.multipartFormData) { request =>
    request.body.file("file").map { picture =>
      val image = System.currentTimeMillis().toString
      val res = Json.obj(
        "files" -> Json.arr(
          Json.obj(
            "name" -> image
          )
        )
      )
      val filename = picture.filename
      val contentType = picture.contentType
      picture.ref.moveTo(new File(System.getenv("TMPDIR")+image+".gif"))
      Ok(res).as(JSON)
    }.getOrElse {
      Redirect(routes.Application.index).flashing(
        "error" -> "Missing file"
      )
    }
  }
  def images(id: String) = Action {
    try{
      Ok.sendFile(new File(System.getenv("OPENSHIFT_DATA_DIR")+"images/" + id+".gif")).as("image/png")
    }
    catch{
      case e:FileNotFoundException => Ok("");
    }

  }
  def tempImages(id: String) = Action {
    try{
      Ok.sendFile(new File(System.getenv("TMPDIR") + id+".gif")).as("image/png")
    }
    catch{
      case e:FileNotFoundException => Ok("");
    }

  }

  def deleteImages(id: String, action: Boolean) = Action {
    implicit request => {
    try{
      val repo = if(action) System.getenv("OPENSHIFT_DATA_DIR")+"images/" +id+".gif" else System.getenv("TMPDIR")+id+".gif"
      val imgSrc = new File(repo)
      imgSrc.delete()
      DBUtil.speakers.update(MongoDBObject("_id" -> session.get("name").get),  $unset("image"))
      Ok("File Deleted");
    }
    catch{
      case e: FileNotFoundException => Ok("No file deleted");
    }
    }
  }
}


