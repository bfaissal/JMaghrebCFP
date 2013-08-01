
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
                    <li><a href="#resetPassword" data-toggle="tab">Reset Password</a></li>
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
                                        """),format.raw/*59.41*/("""{"""),format.raw/*59.42*/("""{"""),format.raw/*59.43*/("""message.msg"""),format.raw/*59.54*/("""}"""),format.raw/*59.55*/("""}"""),format.raw/*59.56*/("""
                                    </div>
                                </div>

                                <div class="control-group">
                                        <!-- Username -->
                                    <label class="control-label" for="username" >Username</label>
                                    <div class="controls">
                                        <input type="email" id="username" name="username"  ng-model="login._id" placeholder="" class="input-xlarge">
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
                    <div class="tab-pane fade" id="resetPassword">
                        <form class="form-horizontal" name="resetPasswordForm" action='' method="POST" ng-controller="loginController" novalidate>
                            <fieldset>
                                <div id="legend">
                                    <legend class="">Reset Password</legend>
                                </div>
                                <div class="control-group" ng-show="message.msg != null">
                                    <div class="alert" ng-class="message.type">
                                        """),format.raw/*97.41*/("""{"""),format.raw/*97.42*/("""{"""),format.raw/*97.43*/("""message.msg"""),format.raw/*97.54*/("""}"""),format.raw/*97.55*/("""}"""),format.raw/*97.56*/("""
                                    </div>
                                </div>

                                <div class="control-group">
                                        <!-- Username -->
                                    <label class="control-label" for="usernamep" >Username</label>
                                    <div class="controls">
                                        <input type="email" id="usernamep" ng-required="true" name="username" ng-model="login._id" placeholder="" class="input-xlarge">
                                    </div>
                                </div>

                                <div class="control-group">
                                        <!-- Button -->
                                    <div class="controls">
                                        <button class="btn" ng-disabled="resetPasswordForm.$invalid" ng-click="resetPassword()">Reset Password</button>
                                    </div>
                                </div>
                            </fieldset>
                        </form>
                    </div>
                    <div class="tab-pane fade" id="create">
                        <form id="registration" id="registration" name="registration" novalidate class="form-horizontal" action='' method="POST" ng-controller="registerController">
                            <fieldset>
                                <div id="legendRegistration">
                                    <legend class="">Speak In JMaghreb</legend>
                                </div>
                                <div class="control-group" ng-show="message.msg != null">
                                    <div class="alert" ng-class="message.type">
                                        """),format.raw/*126.41*/("""{"""),format.raw/*126.42*/("""{"""),format.raw/*126.43*/("""message.msg"""),format.raw/*126.54*/("""}"""),format.raw/*126.55*/("""}"""),format.raw/*126.56*/("""
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
                                    <label class="control-label" for="bio">Picture</label>
                                    <div class="controls">
                                        <uploader id="picture" image="speaker.image" url="upload"></uploader>
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
                                        <button class="btn" ng-disabled="registration.$invalid || (speaker.password != speaker.cpassword) || (speaker.image == null || speaker.image=='')" ng-click="createAccounte()">
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


""")))}/*200.2*/{_display_(Seq[Any](format.raw/*200.3*/("""

    <script src=""""),_display_(Seq[Any](/*202.19*/routes/*202.25*/.Assets.at("javascripts/jquery.ui.widget.js"))),format.raw/*202.70*/("""" type="text/javascript"></script>
    <script src=""""),_display_(Seq[Any](/*203.19*/routes/*203.25*/.Assets.at("javascripts/jquery.iframe-transport.js"))),format.raw/*203.77*/("""" type="text/javascript"></script>
    <script src=""""),_display_(Seq[Any](/*204.19*/routes/*204.25*/.Assets.at("javascripts/jquery.fileupload.js"))),format.raw/*204.71*/("""" type="text/javascript"></script>

""")))})),format.raw/*206.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.Html = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jul 31 21:32:07 EDT 2013
                    SOURCE: /Users/faissalboutaounte/Sites/JMaghrebCFP/app/views/index.scala.html
                    HASH: b89ae8f873e9604d9fac4a4f691c08b141fe0cc0
                    MATRIX: 505->1|599->18|636->21|666->43|705->45|790->95|804->101|860->136|881->140|918->141|3386->2581|3415->2582|3444->2583|3483->2594|3512->2595|3541->2596|5754->4781|5783->4782|5812->4783|5851->4794|5880->4795|5909->4796|7728->6586|7758->6587|7788->6588|7828->6599|7858->6600|7888->6601|12285->10979|12324->10980|12381->11000|12397->11006|12465->11051|12555->11104|12571->11110|12646->11162|12736->11215|12752->11221|12821->11267|12890->11304
                    LINES: 19->1|22->1|24->3|24->3|24->3|25->4|25->4|25->4|26->5|26->5|80->59|80->59|80->59|80->59|80->59|80->59|118->97|118->97|118->97|118->97|118->97|118->97|147->126|147->126|147->126|147->126|147->126|147->126|221->200|221->200|223->202|223->202|223->202|224->203|224->203|224->203|225->204|225->204|225->204|227->206
                    -- GENERATED --
                */
            