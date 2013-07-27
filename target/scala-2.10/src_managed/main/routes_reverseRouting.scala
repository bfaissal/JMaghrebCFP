// @SOURCE:/Users/faissalboutaounte/Sites/JMaghrebCFP/conf/routes
// @HASH:b8570703ad1b4234869d52f66f9d73bef3ad093e
// @DATE:Sat Jul 27 15:58:18 EDT 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:18
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
                                                

// @LINE:9
def login(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:10
def resetPassword(): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:11
def changePassword(email:String, code:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login/" + implicitly[PathBindable[String]].unbind("email", email) + "/" + implicitly[PathBindable[String]].unbind("code", code))
}
                                                

// @LINE:16
def activateSpeaker(email:String, code:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "activate/" + implicitly[PathBindable[String]].unbind("email", email) + "/" + implicitly[PathBindable[String]].unbind("code", code))
}
                                                

// @LINE:12
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:15
def editSpeaker(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "speaker")
}
                                                

// @LINE:8
def profile(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "profile")
}
                                                

// @LINE:14
def createSpeaker(): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "speaker")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:13
def getSpeaker(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "speaker")
}
                                                
    
}
                          

// @LINE:18
class ReverseAssets {
    

// @LINE:18
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          
}
                  


// @LINE:18
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
                        

// @LINE:9
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:10
def resetPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.resetPassword",
   """
      function() {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:11
def changePassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.changePassword",
   """
      function(email,code) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", email) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("code", code)})
      }
   """
)
                        

// @LINE:16
def activateSpeaker : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.activateSpeaker",
   """
      function(email,code) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "activate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", email) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("code", code)})
      }
   """
)
                        

// @LINE:12
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:15
def editSpeaker : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.editSpeaker",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "speaker"})
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
                        

// @LINE:14
def createSpeaker : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createSpeaker",
   """
      function() {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "speaker"})
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
                        

// @LINE:13
def getSpeaker : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getSpeaker",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "speaker"})
      }
   """
)
                        
    
}
              

// @LINE:18
class ReverseAssets {
    

// @LINE:18
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
        


// @LINE:18
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
                      

// @LINE:9
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:10
def resetPassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.resetPassword(), HandlerDef(this, "controllers.Application", "resetPassword", Seq(), "PUT", """""", _prefix + """login""")
)
                      

// @LINE:11
def changePassword(email:String, code:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.changePassword(email, code), HandlerDef(this, "controllers.Application", "changePassword", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """login/$email<[^/]+>/$code<[^/]+>""")
)
                      

// @LINE:16
def activateSpeaker(email:String, code:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.activateSpeaker(email, code), HandlerDef(this, "controllers.Application", "activateSpeaker", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """activate/$email<[^/]+>/$code<[^/]+>""")
)
                      

// @LINE:12
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:15
def editSpeaker(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.editSpeaker(), HandlerDef(this, "controllers.Application", "editSpeaker", Seq(), "POST", """""", _prefix + """speaker""")
)
                      

// @LINE:8
def profile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.profile(), HandlerDef(this, "controllers.Application", "profile", Seq(), "GET", """""", _prefix + """profile""")
)
                      

// @LINE:14
def createSpeaker(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createSpeaker(), HandlerDef(this, "controllers.Application", "createSpeaker", Seq(), "PUT", """""", _prefix + """speaker""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:13
def getSpeaker(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getSpeaker(), HandlerDef(this, "controllers.Application", "getSpeaker", Seq(), "GET", """""", _prefix + """speaker""")
)
                      
    
}
                          

// @LINE:18
class ReverseAssets {
    

// @LINE:18
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          
}
                  
      