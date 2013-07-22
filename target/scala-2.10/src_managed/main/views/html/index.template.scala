
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/main("Welcome to Play 2.1")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
    <div class="container" id="loginModal">
        <div>
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
            <h3>Have an Account?</h3>
        </div>
        <div >
            <div>
                <ul class="nav nav-tabs">
                    <li class="active"><a href="#login" data-toggle="tab">Login</a></li>
                    <li><a href="#create" data-toggle="tab">Create Account</a></li>
                </ul>
                <div id="myTabContent" class="tab-content">
                    <div class="tab-pane active in" id="login">
                        <form class="form-horizontal" action='' method="POST" ng-controller="loginController">
                            <fieldset>
                                <div id="legend">
                                    <legend class="">Login into CFP portal</legend>
                                </div>
                                <div class="control-group" ng-show="message.msg != null">
                                    <div class="alert" ng-class="message.type">
                                        """),format.raw/*24.41*/("""{"""),format.raw/*24.42*/("""{"""),format.raw/*24.43*/("""message.msg"""),format.raw/*24.54*/("""}"""),format.raw/*24.55*/("""}"""),format.raw/*24.56*/("""
                                    </div>
                                </div>
                                <div class="control-group">
                                        <!-- Username -->
                                    <label class="control-label"  for="username" >Username</label>
                                    <div class="controls">
                                        <input type="text" id="username" name="username" ng-model="login._id" placeholder="" class="input-xlarge">
                                    </div>
                                </div>

                                <div class="control-group">
                                        <!-- Password-->
                                    <label class="control-label" for="password">Password</label>
                                    <div class="controls">
                                        <input type="password" id="password" name="password" ng-model="login.password" placeholder="" class="input-xlarge">
                                    </div>
                                </div>


                                <div class="control-group">
                                        <!-- Button -->
                                    <div class="controls">
                                        <button class="btn" ng-click="doLogin()">Login</button>
                                    </div>
                                </div>
                            </fieldset>
                        </form>
                    </div>
                    <div class="tab-pane fade" id="create">
                        <form id="tab" class="form-horizontal" action='' method="POST" ng-controller="registerController">
                            <fieldset>
                                <div id="legend">
                                    <legend class="">Speak In JMaghreb</legend>
                                </div>
                                <div class="control-group" ng-show="message.msg != null">
                                    <div class="alert" ng-class="message.type">
                                        """),format.raw/*61.41*/("""{"""),format.raw/*61.42*/("""{"""),format.raw/*61.43*/("""message.msg"""),format.raw/*61.54*/("""}"""),format.raw/*61.55*/("""}"""),format.raw/*61.56*/("""
                                    </div>
                                </div>
                            <div class="control-group">
                                <label class="control-label">First Name</label>
                                <div class="controls">
                                    <input type="text" ng-model="speaker.fname" class="input-xlarge">
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label">Last Name</label>
                                <div class="controls">
                                    <input type="text" ng-model="speaker.lname" class="input-xlarge">
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label">Email</label>
                                <div class="controls">
                                    <input type="email" ng-required="true" required="true" ng-model="speaker._id" class="input-xlarge">
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label">Password</label>
                                <div class="controls">
                                    <input type="password" ng-model="speaker.password" class="input-xlarge">
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label">Confirm password</label>
                                <div class="controls">
                                    <input type="password" ng-model="speaker.cpassword" class="input-xlarge">
                                </div>
                            </div>
                            <div class="control-group">

                                <div class="controls">
                                    <button class="btn" ng-click="createAccounte()">Create Account</button>
                                </div>
                            </div>
                            </fieldset>
                            <div>

                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    
""")))})),format.raw/*110.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.Html = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jul 22 10:41:14 EDT 2013
                    SOURCE: /Users/faissalboutaounte/Sites/JMaghrebCFP/app/views/index.scala.html
                    HASH: d8917190902fead40af1ca6a91f8b93063697bbf
                    MATRIX: 505->1|599->18|636->21|671->48|710->50|1876->1188|1905->1189|1934->1190|1973->1201|2002->1202|2031->1203|4214->3358|4243->3359|4272->3360|4311->3371|4340->3372|4369->3373|6892->5864
                    LINES: 19->1|22->1|24->3|24->3|24->3|45->24|45->24|45->24|45->24|45->24|45->24|82->61|82->61|82->61|82->61|82->61|82->61|131->110
                    -- GENERATED --
                */
            