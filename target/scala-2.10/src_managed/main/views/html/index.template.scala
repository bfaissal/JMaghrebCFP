
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

"""),_display_(Seq[Any](/*3.2*/main("Login register")/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*4.50*/routes/*4.56*/.Assets.at("stylesheets/style.css"))),format.raw/*4.91*/("""">
""")))}/*5.2*/{_display_(Seq[Any](format.raw/*5.3*/("""
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

    <!-- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -->


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
                                        """),format.raw/*58.41*/("""{"""),format.raw/*58.42*/("""{"""),format.raw/*58.43*/("""message.msg"""),format.raw/*58.54*/("""}"""),format.raw/*58.55*/("""}"""),format.raw/*58.56*/("""
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
                                        """),format.raw/*96.41*/("""{"""),format.raw/*96.42*/("""{"""),format.raw/*96.43*/("""message.msg"""),format.raw/*96.54*/("""}"""),format.raw/*96.55*/("""}"""),format.raw/*96.56*/("""
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


""")))})),format.raw/*164.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.Html = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jul 23 14:34:22 EDT 2013
                    SOURCE: /Users/faissalboutaounte/Sites/JMaghrebCFP/app/views/index.scala.html
                    HASH: 9516602eb3e63b454c7595a0949d01fb70f198c8
                    MATRIX: 505->1|599->18|636->21|666->43|705->45|790->95|804->101|860->136|881->140|918->141|3295->2490|3324->2491|3353->2492|3392->2503|3421->2504|3450->2505|5685->4712|5714->4713|5743->4714|5782->4725|5811->4726|5840->4727|9800->8655
                    LINES: 19->1|22->1|24->3|24->3|24->3|25->4|25->4|25->4|26->5|26->5|79->58|79->58|79->58|79->58|79->58|79->58|117->96|117->96|117->96|117->96|117->96|117->96|185->164
                    -- GENERATED --
                */
            