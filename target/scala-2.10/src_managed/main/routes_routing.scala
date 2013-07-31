// @SOURCE:/Users/faissalboutaounte/Sites/JMaghrebCFP/conf/routes
// @HASH:6709c5397ec1d6d95763c0a46d7a349d586c590d
// @DATE:Tue Jul 30 19:15:34 EDT 2013


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
private[this] lazy val controllers_Application_resetPassword4 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:11
private[this] lazy val controllers_Application_changePassword5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login/"),DynamicPart("email", """[^/]+"""),StaticPart("/"),DynamicPart("code", """[^/]+"""))))
        

// @LINE:12
private[this] lazy val controllers_Application_logout6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:13
private[this] lazy val controllers_Application_getSpeaker7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("speaker"))))
        

// @LINE:14
private[this] lazy val controllers_Application_createSpeaker8 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("speaker"))))
        

// @LINE:15
private[this] lazy val controllers_Application_editSpeaker9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("speaker"))))
        

// @LINE:16
private[this] lazy val controllers_Application_activateSpeaker10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("activate/"),DynamicPart("email", """[^/]+"""),StaticPart("/"),DynamicPart("code", """[^/]+"""))))
        

// @LINE:17
private[this] lazy val controllers_Application_upload11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("upload"))))
        

// @LINE:18
private[this] lazy val controllers_Application_images12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("images/"),DynamicPart("id", """[^/]+"""))))
        

// @LINE:19
private[this] lazy val controllers_Application_tempImages13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tmpImages/"),DynamicPart("id", """[^/]+"""))))
        

// @LINE:20
private[this] lazy val controllers_Application_deleteImages14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deleteImage/"),DynamicPart("id", """[^/]+"""),StaticPart("/"),DynamicPart("action", """[^/]+"""))))
        

// @LINE:22
private[this] lazy val controllers_Assets_at15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+"""))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """go""","""controllers.Application.go"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profile""","""controllers.Application.profile"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.resetPassword"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login/$email<[^/]+>/$code<[^/]+>""","""controllers.Application.changePassword(email:String, code:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """speaker""","""controllers.Application.getSpeaker"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """speaker""","""controllers.Application.createSpeaker"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """speaker""","""controllers.Application.editSpeaker"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """activate/$email<[^/]+>/$code<[^/]+>""","""controllers.Application.activateSpeaker(email:String, code:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """upload""","""controllers.Application.upload"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """images/$id<[^/]+>""","""controllers.Application.images(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tmpImages/$id<[^/]+>""","""controllers.Application.tempImages(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deleteImage/$id<[^/]+>/$action<[^/]+>""","""controllers.Application.deleteImages(id:String, action:Boolean)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e match {
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
case controllers_Application_resetPassword4(params) => {
   call { 
        invokeHandler(controllers.Application.resetPassword, HandlerDef(this, "controllers.Application", "resetPassword", Nil,"PUT", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:11
case controllers_Application_changePassword5(params) => {
   call(params.fromPath[String]("email", None), params.fromPath[String]("code", None)) { (email, code) =>
        invokeHandler(controllers.Application.changePassword(email, code), HandlerDef(this, "controllers.Application", "changePassword", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """login/$email<[^/]+>/$code<[^/]+>"""))
   }
}
        

// @LINE:12
case controllers_Application_logout6(params) => {
   call { 
        invokeHandler(controllers.Application.logout, HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:13
case controllers_Application_getSpeaker7(params) => {
   call { 
        invokeHandler(controllers.Application.getSpeaker, HandlerDef(this, "controllers.Application", "getSpeaker", Nil,"GET", """""", Routes.prefix + """speaker"""))
   }
}
        

// @LINE:14
case controllers_Application_createSpeaker8(params) => {
   call { 
        invokeHandler(controllers.Application.createSpeaker, HandlerDef(this, "controllers.Application", "createSpeaker", Nil,"PUT", """""", Routes.prefix + """speaker"""))
   }
}
        

// @LINE:15
case controllers_Application_editSpeaker9(params) => {
   call { 
        invokeHandler(controllers.Application.editSpeaker, HandlerDef(this, "controllers.Application", "editSpeaker", Nil,"POST", """""", Routes.prefix + """speaker"""))
   }
}
        

// @LINE:16
case controllers_Application_activateSpeaker10(params) => {
   call(params.fromPath[String]("email", None), params.fromPath[String]("code", None)) { (email, code) =>
        invokeHandler(controllers.Application.activateSpeaker(email, code), HandlerDef(this, "controllers.Application", "activateSpeaker", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """activate/$email<[^/]+>/$code<[^/]+>"""))
   }
}
        

// @LINE:17
case controllers_Application_upload11(params) => {
   call { 
        invokeHandler(controllers.Application.upload, HandlerDef(this, "controllers.Application", "upload", Nil,"POST", """""", Routes.prefix + """upload"""))
   }
}
        

// @LINE:18
case controllers_Application_images12(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.Application.images(id), HandlerDef(this, "controllers.Application", "images", Seq(classOf[String]),"GET", """""", Routes.prefix + """images/$id<[^/]+>"""))
   }
}
        

// @LINE:19
case controllers_Application_tempImages13(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.Application.tempImages(id), HandlerDef(this, "controllers.Application", "tempImages", Seq(classOf[String]),"GET", """""", Routes.prefix + """tmpImages/$id<[^/]+>"""))
   }
}
        

// @LINE:20
case controllers_Application_deleteImages14(params) => {
   call(params.fromPath[String]("id", None), params.fromPath[Boolean]("action", None)) { (id, action) =>
        invokeHandler(controllers.Application.deleteImages(id, action), HandlerDef(this, "controllers.Application", "deleteImages", Seq(classOf[String], classOf[Boolean]),"GET", """""", Routes.prefix + """deleteImage/$id<[^/]+>/$action<[^/]+>"""))
   }
}
        

// @LINE:22
case controllers_Assets_at15(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}
    
}
        