
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

"""),_display_(Seq[Any](/*3.2*/main("JMaghreb Call For Paper")/*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
""")))}/*5.2*/ {_display_(Seq[Any](format.raw/*5.4*/("""
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
                        <span>"""),format.raw/*17.31*/("""{"""),format.raw/*17.32*/("""{"""),format.raw/*17.33*/("""login.lname"""),format.raw/*17.44*/("""}"""),format.raw/*17.45*/("""}"""),format.raw/*17.46*/(""" """),format.raw/*17.47*/("""{"""),format.raw/*17.48*/("""{"""),format.raw/*17.49*/("""login.fname"""),format.raw/*17.60*/("""}"""),format.raw/*17.61*/("""}"""),format.raw/*17.62*/(""" ("""),format.raw/*17.64*/("""{"""),format.raw/*17.65*/("""{"""),format.raw/*17.66*/("""login._id"""),format.raw/*17.75*/("""}"""),format.raw/*17.76*/("""}"""),format.raw/*17.77*/(""")</span>
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

                <form id="registration" id="registration" name="registration" novalidate class="form-horizontal" action='' method="POST" ng-controller="registerController">
                    <fieldset>
                        <div id="legendRegistration">
                            <legend class="">Speak In JMaghreb</legend>
                        </div>
                        <div class="control-group" ng-show="message.msg != null">
                            <div class="alert" ng-class="message.type">
                                """),format.raw/*50.33*/("""{"""),format.raw/*50.34*/("""{"""),format.raw/*50.35*/("""message.msg"""),format.raw/*50.46*/("""}"""),format.raw/*50.47*/("""}"""),format.raw/*50.48*/("""
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
                                <input type="email" ng-required="true" id="email" required="true" ng-model=" ._id" class="input-xlarge">
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
""")))})),format.raw/*99.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.Html = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jul 26 02:13:49 EDT 2013
                    SOURCE: /Users/faissalboutaounte/Sites/JMaghrebCFP/app/views/profile.scala.html
                    HASH: 10405dfce7ae930fe22ca321395d190e183ac4dc
                    MATRIX: 507->1|601->18|638->21|677->52|716->54|810->131|848->133|1494->751|1523->752|1552->753|1591->764|1620->765|1649->766|1678->767|1707->768|1736->769|1775->780|1804->781|1833->782|1863->784|1892->785|1921->786|1958->795|1987->796|2016->797|3393->2146|3422->2147|3451->2148|3490->2159|3519->2160|3548->2161|6035->4617
                    LINES: 19->1|22->1|24->3|24->3|24->3|26->5|26->5|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|71->50|71->50|71->50|71->50|71->50|71->50|120->99
                    -- GENERATED --
                */
            