package controllers

import play.api.mvc._
import com.mongodb.casbah.Imports._
import util.{CFPUtil, MailUtil, DBUtil}

import play.api.libs.json.{JsObject, JsNull, Json}
import play.api.i18n.Messages.Message
import play.api.i18n.Messages
import java.util.{UUID, Calendar}
import play.api.Play

object Application extends Controller {

  def index = Action {
    implicit request =>
      println("OPENSHIFT_GRID_MAIL_USER ================> " + Play.current.configuration.getString("OPENSHIFT_GRID_MAIL_USER"))
      println("OPENSHIFT_GRID_MAIL_password ================> " + Play.current.configuration.getString("OPENSHIFT_GRID_MAIL_password"))

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
            println("pass " +(json \ "password").as[String])
            println("un " +(json \ "_id").as[String])
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
    request =>
      try {
        request.body.asJson.map {
          json => {
            val activationCode = CFPUtil.randomString()
            val resultJson = (json, Json.obj("activationCode" -> activationCode)) match {
              case (a: JsObject, b: JsObject) => a ++ b
              case _ => JsNull
            }
            if ((json \ "_id").asOpt[String].isEmpty) BadRequest("username is empty")
            else {
              DBUtil.speakers += (com.mongodb.util.JSON.parse(resultJson.toString())
              match {
                case x: DBObject => x;
                case _ => throw new ClassCastException
              })
              val res = Messages("registration.email.body", (json \ "fname").as[String], (json \ "_id").as[String], activationCode)
              MailUtil.send((json \ "_id").as[String], Messages("registration.email.subject"), res, (json \ "fname").as[String])
              Ok("{}").as(JSON)
            }
          }
        }.getOrElse(BadRequest("Error"))
      }
      catch {
        case e => InternalServerError("{\"message\":\"Dublicate username ;)\",\"exception\":\"" + e.getMessage + "\"}").as(JSON)
      }
  }

  def editSpeaker() = Action {
    request =>
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
              Ok(json).as(JSON)
            }
            catch {
              case e => InternalServerError("{\"message\":\"Dublicate username \"}").as(JSON)
            }
          }
        }
      }.getOrElse(BadRequest("Error"))
  }
}


