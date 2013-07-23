
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
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*4.50*/routes/*4.56*/.Assets.at("stylesheets/style.css"))),format.raw/*4.91*/("""">
    <div class="slide" id="slide1" data-slide="1" data-stellar-background-ratio="0.5">
        <div class="effect_2 padding_slide1">
            <div class="container clearfix">

                <div id="content" class="grid_12">
                    <div class="filtr_bg">
                        <div class="slogan">
                            <div class="left_bord"></div>
                            <div class="slogan_text">7 & 8 Nov. 2013</div>
                            <div class="right_bord"></div>
                        </div>
                        <h1>JMaghreb 2.0</h1>
                        <h2>The bigest JAVA conference in north Africa</h2>
                        <div class="left_bord"></div>
                        <div class="button_block">
                            <div class="button_bg"></div>
                            <a class="button" onclick="window.location.href='#legend'" href="#legend">
                                Sign In / Sign UP<span></span></a>

                        </div>

                        <div class="right_bord"></div>
                    </div>
                    <div class="clear"></div>
                </div>
            </div>
        </div>

    </div>

    <!--- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -- -->


    <div class="container" id="loginModal">
        <div>
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
                                        """),format.raw/*57.41*/("""{"""),format.raw/*57.42*/("""{"""),format.raw/*57.43*/("""message.msg"""),format.raw/*57.54*/("""}"""),format.raw/*57.55*/("""}"""),format.raw/*57.56*/("""
                                    </div>
                                </div>

                                <div class="control-group">
                                        <!-- Username -->
                                    <label class="control-label" for="username" >Username</label>
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
                        <form id="registration" name="registration" novalidate class="form-horizontal" action='' method="POST" ng-controller="registerController">
                            <fieldset>
                                <div id="legendRegistration">
                                    <legend class="">Speak In JMaghreb</legend>
                                </div>
                                <div class="control-group" ng-show="message.msg != null">
                                    <div class="alert" ng-class="message.type">
                                        """),format.raw/*95.41*/("""{"""),format.raw/*95.42*/("""{"""),format.raw/*95.43*/("""message.msg"""),format.raw/*95.54*/("""}"""),format.raw/*95.55*/("""}"""),format.raw/*95.56*/("""
                                    </div>
                                </div>
                                <div class="control-group">
                                    All fields are required
                                </div>
                                <div class="control-group">
                                    <label class="control-label" for="fname">First Name</label>
                                    <div class="controls">
                                        <input type="text" id="fname" ng-required="true" ng-model="speaker.fname" class="input-xlarge">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label" for="lname">Last Name</label>
                                    <div class="controls">
                                        <input type="text" id="lname" ng-required="true" ng-model="speaker.lname" class="input-xlarge">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label" for="email">Email</label>
                                    <div class="controls">
                                        <input type="email" ng-required="true" id="email" required="true" ng-model="speaker._id" class="input-xlarge">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label" for="bio">Bio</label>
                                    <div class="controls">
                                        <textarea rows="10" id="bio" ng-maxlength="1000" ng-model="speaker.bio" ng-required="true" class="input-xxlarge"></textarea>
                                        <div>1000 char.</div>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label" for="password">Password</label>
                                    <div class="controls">
                                        <input type="password" id="password" ng-required="true" ng-model="speaker.password" class="input-xlarge">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label" for="cpassword">Confirm password</label>
                                    <div class="controls">
                                        <input type="password" id="cpassword" ng-required="true" ng-model="speaker.cpassword" class="input-xlarge">
                                    </div>
                                </div>
                                <div class="control-group">

                                    <div class="controls">
                                        <button class="btn" ng-disabled="registration.$invalid || (speaker.password != speaker.cpassword)" ng-click="createAccounte()">
                                            Create Account</button>
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
    </div>
    <div id="footer">
        <div class="container clearfix">
            <div class="copyright">JMaghreb &copy; 2013 | <a href="javascript:void(0);">Privacy Policy</a></div>
            <div id="back_top"><a class="button" title="" data-slide="1"></a></div>
        </div>
    </div>


""")))})),format.raw/*163.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.Html = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jul 22 22:20:28 EDT 2013
                    SOURCE: /Users/faissalboutaounte/Sites/JMaghrebCFP/app/views/index.scala.html
                    HASH: d34edf01b9f68ee445f68e536c052805d788e964
                    MATRIX: 505->1|599->18|636->21|671->48|710->50|795->100|809->106|865->141|3242->2490|3271->2491|3300->2492|3339->2503|3368->2504|3397->2505|5632->4712|5661->4713|5690->4714|5729->4725|5758->4726|5787->4727|9747->8655
                    LINES: 19->1|22->1|24->3|24->3|24->3|25->4|25->4|25->4|78->57|78->57|78->57|78->57|78->57|78->57|116->95|116->95|116->95|116->95|116->95|116->95|184->163
                    -- GENERATED --
                */
            