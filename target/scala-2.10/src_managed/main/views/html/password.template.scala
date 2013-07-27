
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
object password extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

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
                                <a href="/">Home</a>
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

                <form id="registration" id="registration" name="registration" novalidate class="form-horizontal" action='' method="POST" ng-controller="talksController">
                    <fieldset>
                        <div id="legendRegistration">
                            <legend class="">Speak In JMaghreb</legend>
                        </div>
                        <div class="control-group" ng-show="message.msg != null">
                            <div class="alert" ng-class="message.type">
                                """),format.raw/*45.33*/("""{"""),format.raw/*45.34*/("""{"""),format.raw/*45.35*/("""message.msg"""),format.raw/*45.46*/("""}"""),format.raw/*45.47*/("""}"""),format.raw/*45.48*/("""
                            </div>
                        </div>
                        <div class="control-group">
                            All fields are required
                        </div>
                        <div class="control-group">
                            <label class="control-label" for="password">Password</label>
                            <div class="controls">
                                <input type="password" id="password" ng-required="true" ng-model="login.password" class="input-xlarge">
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label" for="cpassword">Confirm password</label>
                            <div class="controls">
                                <input type="password" id="cpassword" ng-required="true" ng-model="login.cpassword" class="input-xlarge">
                            </div>
                        </div>

                        <div class="control-group">

                            <div class="controls">
                                <button class="btn" ng-disabled="registration.$invalid || (login.password != login.cpassword)" ng-click="chnagePassword()">
                                    Save</button>
                            </div>
                        </div>
                    </fieldset>
                    <div>

                    </div>
                </form>
            </div>
        </div>

    </div>
""")))})),format.raw/*80.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.Html = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jul 27 15:58:21 EDT 2013
                    SOURCE: /Users/faissalboutaounte/Sites/JMaghrebCFP/app/views/password.scala.html
                    HASH: ec61cacd626c2d1a9c8ca65268ff3421f00d263b
                    MATRIX: 508->1|602->18|639->21|678->52|717->54|811->131|849->133|1495->751|1524->752|1553->753|1592->764|1621->765|1650->766|1679->767|1708->768|1737->769|1776->780|1805->781|1834->782|1864->784|1893->785|1922->786|1959->795|1988->796|2017->797|3114->1866|3143->1867|3172->1868|3211->1879|3240->1880|3269->1881|4835->3416
                    LINES: 19->1|22->1|24->3|24->3|24->3|26->5|26->5|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|66->45|66->45|66->45|66->45|66->45|66->45|101->80
                    -- GENERATED --
                */
            