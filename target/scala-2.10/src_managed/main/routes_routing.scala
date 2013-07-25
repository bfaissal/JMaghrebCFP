// @SOURCE:/Users/faissalboutaounte/Sites/JMaghrebCFP/conf/routes
// @HASH:37b8e7887d2299514089a7da8b69f6b20a2dff5f
// @DATE:Thu Jul 25 00:55:38 EDT 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix  
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" } 


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_go1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("go"))))
        

// @LINE:8
private[this] lazy val controllers_Application_profile2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profile"))))
        

// @LINE:9
private[this] lazy val controllers_Application_login3 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:10
private[this] lazy val controllers_Application_logout4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:11
private[this] lazy val controllers_Application_getSpeaker5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("speaker"))))
        

// @LINE:12
private[this] lazy val controllers_Application_createSpeaker6 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("speaker"))))
        

// @LINE:13
private[this] lazy val controllers_Application_editSpeaker7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("speaker"))))
        

// @LINE:15
private[this] lazy val controllers_Assets_at8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+"""))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """go""","""controllers.Application.go"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profile""","""controllers.Application.profile"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """speaker""","""controllers.Application.getSpeaker"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """speaker""","""controllers.Application.createSpeaker"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """speaker""","""controllers.Application.editSpeaker"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
       
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_go1(params) => {
   call { 
        invokeHandler(controllers.Application.go, HandlerDef(this, "controllers.Application", "go", Nil,"GET", """""", Routes.prefix + """go"""))
   }
}
        

// @LINE:8
case controllers_Application_profile2(params) => {
   call { 
        invokeHandler(controllers.Application.profile, HandlerDef(this, "controllers.Application", "profile", Nil,"GET", """""", Routes.prefix + """profile"""))
   }
}
        

// @LINE:9
case controllers_Application_login3(params) => {
   call { 
        invokeHandler(controllers.Application.login, HandlerDef(this, "controllers.Application", "login", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:10
case controllers_Application_logout4(params) => {
   call { 
        invokeHandler(controllers.Application.logout, HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:11
case controllers_Application_getSpeaker5(params) => {
   call { 
        invokeHandler(controllers.Application.getSpeaker, HandlerDef(this, "controllers.Application", "getSpeaker", Nil,"GET", """""", Routes.prefix + """speaker"""))
   }
}
        

// @LINE:12
case controllers_Application_createSpeaker6(params) => {
   call { 
        invokeHandler(controllers.Application.createSpeaker, HandlerDef(this, "controllers.Application", "createSpeaker", Nil,"PUT", """""", Routes.prefix + """speaker"""))
   }
}
        

// @LINE:13
case controllers_Application_editSpeaker7(params) => {
   call { 
        invokeHandler(controllers.Application.editSpeaker, HandlerDef(this, "controllers.Application", "editSpeaker", Nil,"POST", """""", Routes.prefix + """speaker"""))
   }
}
        

// @LINE:15
case controllers_Assets_at8(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}
    
}
        