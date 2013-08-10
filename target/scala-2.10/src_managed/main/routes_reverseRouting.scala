// @SOURCE:/Users/faissalboutaounte/Sites/JMaghrebCFP/conf/routes
// @HASH:6ca6235fb53ba0583e511dd20c5dabe82e6a761a
// @DATE:Thu Aug 08 20:46:47 EDT 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def go(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "go")
}
                                                

// @LINE:10
def login(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:11
def resetPassword(): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:9
def allSpeakers(q:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "allSpeakers" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("q", q)))))
}
                                                

// @LINE:12
def changePassword(email:String, code:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login/" + implicitly[PathBindable[String]].unbind("email", email) + "/" + implicitly[PathBindable[String]].unbind("code", code))
}
                                                

// @LINE:17
def activateSpeaker(email:String, code:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "activate/" + implicitly[PathBindable[String]].unbind("email", email) + "/" + implicitly[PathBindable[String]].unbind("code", code))
}
                                                

// @LINE:13
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:19
def images(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "images/" + implicitly[PathBindable[String]].unbind("id", id))
}
                                                

// @LINE:16
def editSpeaker(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "speaker")
}
                                                

// @LINE:20
def tempImages(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "tmpImages/" + implicitly[PathBindable[String]].unbind("id", id))
}
                                                

// @LINE:8
def profile(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "profile")
}
                                                

// @LINE:15
def createSpeaker(): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "speaker")
}
                                                

// @LINE:18
def upload(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "upload")
}
                                                

// @LINE:21
def deleteImages(id:String, action:Boolean): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "deleteImage/" + implicitly[PathBindable[String]].unbind("id", id) + "/" + implicitly[PathBindable[Boolean]].unbind("action", action))
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:14
def getSpeaker(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "speaker")
}
                                                
    
}
                          

// @LINE:23
class ReverseAssets {
    

// @LINE:23
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          
}
                  


// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def go : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.go",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "go"})
      }
   """
)
                        

// @LINE:10
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:11
def resetPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.resetPassword",
   """
      function() {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:9
def allSpeakers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.allSpeakers",
   """
      function(q) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "allSpeakers" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("q", q)])})
      }
   """
)
                        

// @LINE:12
def changePassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.changePassword",
   """
      function(email,code) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", email) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("code", code)})
      }
   """
)
                        

// @LINE:17
def activateSpeaker : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.activateSpeaker",
   """
      function(email,code) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "activate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", email) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("code", code)})
      }
   """
)
                        

// @LINE:13
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:19
def images : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.images",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "images/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:16
def editSpeaker : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.editSpeaker",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "speaker"})
      }
   """
)
                        

// @LINE:20
def tempImages : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.tempImages",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tmpImages/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:8
def profile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.profile",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
      }
   """
)
                        

// @LINE:15
def createSpeaker : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createSpeaker",
   """
      function() {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "speaker"})
      }
   """
)
                        

// @LINE:18
def upload : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.upload",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "upload"})
      }
   """
)
                        

// @LINE:21
def deleteImages : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteImages",
   """
      function(id,action) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteImage/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[Boolean]].javascriptUnbind + """)("action", action)})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:14
def getSpeaker : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getSpeaker",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "speaker"})
      }
   """
)
                        
    
}
              

// @LINE:23
class ReverseAssets {
    

// @LINE:23
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              
}
        


// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {

// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def go(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.go(), HandlerDef(this, "controllers.Application", "go", Seq(), "GET", """""", _prefix + """go""")
)
                      

// @LINE:10
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:11
def resetPassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.resetPassword(), HandlerDef(this, "controllers.Application", "resetPassword", Seq(), "PUT", """""", _prefix + """login""")
)
                      

// @LINE:9
def allSpeakers(q:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.allSpeakers(q), HandlerDef(this, "controllers.Application", "allSpeakers", Seq(classOf[String]), "GET", """""", _prefix + """allSpeakers""")
)
                      

// @LINE:12
def changePassword(email:String, code:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.changePassword(email, code), HandlerDef(this, "controllers.Application", "changePassword", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """login/$email<[^/]+>/$code<[^/]+>""")
)
                      

// @LINE:17
def activateSpeaker(email:String, code:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.activateSpeaker(email, code), HandlerDef(this, "controllers.Application", "activateSpeaker", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """activate/$email<[^/]+>/$code<[^/]+>""")
)
                      

// @LINE:13
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:19
def images(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.images(id), HandlerDef(this, "controllers.Application", "images", Seq(classOf[String]), "GET", """""", _prefix + """images/$id<[^/]+>""")
)
                      

// @LINE:16
def editSpeaker(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.editSpeaker(), HandlerDef(this, "controllers.Application", "editSpeaker", Seq(), "POST", """""", _prefix + """speaker""")
)
                      

// @LINE:20
def tempImages(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.tempImages(id), HandlerDef(this, "controllers.Application", "tempImages", Seq(classOf[String]), "GET", """""", _prefix + """tmpImages/$id<[^/]+>""")
)
                      

// @LINE:8
def profile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.profile(), HandlerDef(this, "controllers.Application", "profile", Seq(), "GET", """""", _prefix + """profile""")
)
                      

// @LINE:15
def createSpeaker(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createSpeaker(), HandlerDef(this, "controllers.Application", "createSpeaker", Seq(), "PUT", """""", _prefix + """speaker""")
)
                      

// @LINE:18
def upload(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.upload(), HandlerDef(this, "controllers.Application", "upload", Seq(), "POST", """""", _prefix + """upload""")
)
                      

// @LINE:21
def deleteImages(id:String, action:Boolean): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteImages(id, action), HandlerDef(this, "controllers.Application", "deleteImages", Seq(classOf[String], classOf[Boolean]), "GET", """""", _prefix + """deleteImage/$id<[^/]+>/$action<[^/]+>""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:14
def getSpeaker(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getSpeaker(), HandlerDef(this, "controllers.Application", "getSpeaker", Seq(), "GET", """""", _prefix + """speaker""")
)
                      
    
}
                          

// @LINE:23
class ReverseAssets {
    

// @LINE:23
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          
}
                  
      