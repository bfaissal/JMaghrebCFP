package controllers

import play.api.mvc._
import com.mongodb.casbah.Imports._
import util.DBUtil

object Application extends Controller {

  def index = Action {  implicit request =>
    if(session.get("name") == None )
      Ok(views.html.index("Salam ! Your new application is ready."))
    else
      Redirect("/go")
  }

  def go = Action {
    implicit request => {
      session.get("name").map {
        _ => Ok(views.html.go("Salam ! Your new application is ready."))
      }.getOrElse(Unauthorized("Your not allowed to access this section"))
    }
  }

  def login = Action {
    implicit request =>
      try{
      request.body.asJson.map {
        json => {
          val query = MongoDBObject("_id" -> (json \ "_id").as[String]) ++ ("password" -> (json \ "password").as[String])
          Ok(DBUtil.speakers.find(query).mkString(",")).withSession("name" -> (json \ "_id").as[String]).as(JSON)

        }
      }.getOrElse(BadRequest("Error"))
      }
      catch{
        case e :Exception => BadRequest("Please enter a valid username/password !");
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

  def createSpeaker() = Action {
    request =>
      try {
        request.body.asJson.map {
          json => {
            if ((json \ "_id").asOpt[String].isEmpty) BadRequest("username is empty")
            else {
              DBUtil.speakers += (com.mongodb.util.JSON.parse(json.toString())
              match {
                case x: DBObject => x;
                case _ => throw new ClassCastException
              })
              Ok("{}").as(JSON)
            }
          }
        }.getOrElse(BadRequest("Error"))
      }
      catch {
        case e => InternalServerError("{\"message\":\"Dublicate username ;)\"}").as(JSON)
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