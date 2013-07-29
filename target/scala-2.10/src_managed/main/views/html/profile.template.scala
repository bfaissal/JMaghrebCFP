
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object profile extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

    """),_display_(Seq[Any](/*3.6*/main("JMaghreb Call For Paper")/*3.37*/ {_display_(Seq[Any](format.raw/*3.39*/("""
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    """)))}/*5.6*/ {_display_(Seq[Any](format.raw/*5.8*/("""
        <div class="container" id="loginModal" ng-controller="talksController">

            <div class="navbar navbar-inverse navbar-fixed-top">
                <div class="navbar-inner">
                    <div class="container">
                        <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="brand" id="brand" href="#">
                            <span>"""),format.raw/*17.35*/("""{"""),format.raw/*17.36*/("""{"""),format.raw/*17.37*/("""login.lname"""),format.raw/*17.48*/("""}"""),format.raw/*17.49*/("""}"""),format.raw/*17.50*/(""" """),format.raw/*17.51*/("""{"""),format.raw/*17.52*/("""{"""),format.raw/*17.53*/("""login.fname"""),format.raw/*17.64*/("""}"""),format.raw/*17.65*/("""}"""),format.raw/*17.66*/(""" ("""),format.raw/*17.68*/("""{"""),format.raw/*17.69*/("""{"""),format.raw/*17.70*/("""login._id"""),format.raw/*17.79*/("""}"""),format.raw/*17.80*/("""}"""),format.raw/*17.81*/(""")</span>
                        </a>
                        <div class="nav-collapse collapse">
                            <ul class="nav">
                                <li class="">
                                    <a href="/go">Talks</a>
                                </li>
                                <li class="">
                                    <a href="/profile">Profile</a>
                                </li>
                                <li class="">
                                    <a href="logout">logout</a>
                                </li>

                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row" >
                <div class="span12">
                    <br/>
                    <br/>
                    <br/>
                    <br/>

                    <form id="registration" name="registration" novalidate class="form-horizontal" action='' method="POST" ng-controller="registerController">
                        <fieldset>
                            <div id="legendRegistration">
                                <legend class="">Speak In JMaghreb</legend>
                            </div>
                            <div class="control-group" ng-show="message.msg != null">
                                <div class="alert" ng-class="message.type">
                                    """),format.raw/*50.37*/("""{"""),format.raw/*50.38*/("""{"""),format.raw/*50.39*/("""message.msg"""),format.raw/*50.50*/("""}"""),format.raw/*50.51*/("""}"""),format.raw/*50.52*/("""
                                </div>
                            </div>
                            <div class="control-group">
                                All fields are required
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="fname">First Name</label>
                                <div class="controls">
                                    <input type="text" id="fname" ng-required="true" ng-model="login.fname" class="input-xlarge">
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="lname">Last Name</label>
                                <div class="controls">
                                    <input type="text" id="lname" ng-required="true" ng-model="login.lname" class="input-xlarge">
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="email">Email</label>
                                <div class="controls">
                                    <input type="email" ng-required="true" id="email" required="true" ng-model="login._id" class="input-xlarge">
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="bio">Bio</label>
                                <div class="controls">
                                    <textarea rows="10" id="bio" ng-maxlength="1000" ng-model="login.bio" ng-required="true" class="input-xxlarge"></textarea>
                                    <div>1000 char.</div>
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="bio">Picture</label>
                                <div class="controls">
                                    <uploader id="pico" image="login.image" url="upload"></uploader>
                                </div>
                            </div>
                            <div class="control-group">

                                <div class="controls">
                                    <button class="btn" ng-disabled="registration.$invalid || (login.password != login.cpassword)" ng-click="editAccounte()">
                                        Save</button>
                                    <button class="btn btn-danger" ng-click="cancelEditAccounte()">Cancel</button>
                                </div>
                            </div>
                        </fieldset>
                        <div>

                        </div>
                    </form>
                </div>
            </div>

        </div>
    """)))}/*104.6*/ {_display_(Seq[Any](format.raw/*104.8*/("""
        <script src=""""),_display_(Seq[Any](/*105.23*/routes/*105.29*/.Assets.at("javascripts/jquery.ui.widget.js"))),format.raw/*105.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*106.23*/routes/*106.29*/.Assets.at("javascripts/jquery.iframe-transport.js"))),format.raw/*106.81*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*107.23*/routes/*107.29*/.Assets.at("javascripts/jquery.fileupload.js"))),format.raw/*107.75*/("""" type="text/javascript"></script>



    """)))})),format.raw/*111.6*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.Html = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jul 29 18:32:33 EDT 2013
                    SOURCE: /Users/faissalboutaounte/Sites/JMaghrebCFP/app/views/profile.scala.html
                    HASH: 73411efd5b62b59331818810d9f73ded5d95b369
                    MATRIX: 507->1|601->18|642->25|681->56|720->58|822->143|860->145|1550->807|1579->808|1608->809|1647->820|1676->821|1705->822|1734->823|1763->824|1792->825|1831->836|1860->837|1889->838|1919->840|1948->841|1977->842|2014->851|2043->852|2072->853|3555->2308|3584->2309|3613->2310|3652->2321|3681->2322|3710->2323|6741->5335|6781->5337|6841->5360|6857->5366|6925->5411|7019->5468|7035->5474|7110->5526|7204->5583|7220->5589|7289->5635|7364->5678
                    LINES: 19->1|22->1|24->3|24->3|24->3|26->5|26->5|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|71->50|71->50|71->50|71->50|71->50|71->50|125->104|125->104|126->105|126->105|126->105|127->106|127->106|127->106|128->107|128->107|128->107|132->111
                    -- GENERATED --
                */
            