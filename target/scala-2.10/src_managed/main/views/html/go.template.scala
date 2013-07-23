
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
object go extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/main("JMaghreb Call For Paper")/*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""
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
                        <span>"""),format.raw/*15.31*/("""{"""),format.raw/*15.32*/("""{"""),format.raw/*15.33*/("""login.lname"""),format.raw/*15.44*/("""}"""),format.raw/*15.45*/("""}"""),format.raw/*15.46*/(""" """),format.raw/*15.47*/("""{"""),format.raw/*15.48*/("""{"""),format.raw/*15.49*/("""login.fname"""),format.raw/*15.60*/("""}"""),format.raw/*15.61*/("""}"""),format.raw/*15.62*/(""" ("""),format.raw/*15.64*/("""{"""),format.raw/*15.65*/("""{"""),format.raw/*15.66*/("""login._id"""),format.raw/*15.75*/("""}"""),format.raw/*15.76*/("""}"""),format.raw/*15.77*/(""")</span>
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
                <table class="table table-striped" ng-show="login.talks.length > 0 && !edition">
                    <thead>
                        <tr>
                            <th>Title</th>
                            <th>Status</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr ng-repeat="aTrack in login.talks">
                            <td>"""),format.raw/*50.33*/("""{"""),format.raw/*50.34*/("""{"""),format.raw/*50.35*/("""aTrack.title"""),format.raw/*50.47*/("""}"""),format.raw/*50.48*/("""}"""),format.raw/*50.49*/("""</td>
                            <td>"""),format.raw/*51.33*/("""{"""),format.raw/*51.34*/("""{"""),format.raw/*51.35*/(""" aTrack.status == 2 ? 'Submitted' : 'In progress' """),format.raw/*51.85*/("""}"""),format.raw/*51.86*/("""}"""),format.raw/*51.87*/("""</td>
                            <td>
                                <button class="btn" ng-click="editaTrack(aTrack)" ng-show="aTrack.status == 1" value="edit"><span class="icon-edit"></span> Edit</button>
                            </td>
                            <td>
                                <button class="btn" ng-click="submitTrack(aTrack)" ng-show="aTrack.status == 1" value="edit"><span class="icon-ok"></span> Submit</button>
                            </td>
                        </tr>
                    </tbody>
                </table>

                <form ng-show="edition || showFormVal" class="form-horizontal" name="submissionForm" id="submissionForm" action='' method="POST" novalidate>
                    <fieldset>
                        <div id="legend">
                            <legend class="">Submit  a talk</legend>
                        </div>
                        <div class="control-group" ng-show="message.msg != null">
                            <div class="alert" ng-class="message.type">
                                """),format.raw/*69.33*/("""{"""),format.raw/*69.34*/("""{"""),format.raw/*69.35*/("""message.msg"""),format.raw/*69.46*/("""}"""),format.raw/*69.47*/("""}"""),format.raw/*69.48*/("""
                            </div>
                        </div>
                        <div class="control-group">
                                <!-- Title -->
                            <label class="control-label"  for="title" >Title</label>
                            <div class="controls">
                                <input type="text" id="title" name="title" ng-maxlength="200" ng-model="selected.title" ng-required="true" placeholder="" class="input-xxlarge">
                            </div>
                        </div>

                        <div class="control-group">
                                <!-- Abstract-->
                            <label class="control-label" for="language">Language</label>
                            <div class="controls">
                                <select name="language" id="language" class="input-xxlarge" ng-model="selected.language">
                                    <option value="1">Arabic</option>
                                    <option value="2">French</option>
                                    <option value="3">English</option>

                                </select>
                            </div>
                        </div>
                        <div class="control-group">
                                <!-- Abstract-->
                            <label class="control-label" for="type">Abstract</label>
                            <div class="controls">
                                <select name="type" id="type" class="input-xxlarge" ng-model="selected.type">
                                    <option value="0">Architecture and Security</option>
                                    <option value="3">Cloud &amp; BigData</option>
                                    <option value="7">Future&lt;Devoxx&gt;</option>
                                    <option value="6">Java EE</option>
                                    <option value="4">Java SE</option>
                                    <option value="1">JVM Languages</option>
                                    <option value="2">Methodology</option>
                                    <option value="5">Mobile</option>
                                    <option value="8">Web &amp; HTML5</option>
                                </select>
                            </div>
                        </div>

                        <div class="control-group">
                                <!-- Abstract-->
                            <label class="control-label" for="language">Audience Experience</label>
                            <div class="controls">
                                <select name="language" id="language" class="input-xxlarge" ng-model="selected.level">
                                    <option value="1">Novice</option>
                                    <option value="2">Senior</option>
                                    <option value="3">Expert</option>

                                </select>
                            </div>
                        </div>
                        <div class="control-group">
                                <!-- Abstract-->
                            <label class="control-label" for="abstract">Abstract</label>
                            <div class="controls">
                                <textarea id="abstract" rows="10" ng-required="true" ng-maxlength="1000" name="abstract" ng-model="selected.abstract" placeholder="" class="input-xxlarge"></textarea>
                            </div>
                        </div>

                        <div class="control-group">
                                <!-- Button -->
                            <div class="controls">
                                <button class="btn" ng-disabled="submissionForm.$invalid" ng-click="addTalk()">Save</button>
                            </div>
                        </div>
                    </fieldset>
                </form>
            </div>
        </div>
        <div class="row" ng-show="!edition && !showFormVal">
            <div class="span12">
                <button class="btn btn-primary" ng-click="showForm()">Add a talk</button>
            </div>
        </div>
    </div>
""")))})),format.raw/*146.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.Html = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jul 23 10:17:46 EDT 2013
                    SOURCE: /Users/faissalboutaounte/Sites/JMaghrebCFP/app/views/go.scala.html
                    HASH: 40592c68adfc733878b2cd8e68389d64170bf725
                    MATRIX: 502->1|596->18|633->21|672->52|711->54|1357->672|1386->673|1415->674|1454->685|1483->686|1512->687|1541->688|1570->689|1599->690|1638->701|1667->702|1696->703|1726->705|1755->706|1784->707|1821->716|1850->717|1879->718|3169->1980|3198->1981|3227->1982|3267->1994|3296->1995|3325->1996|3391->2034|3420->2035|3449->2036|3527->2086|3556->2087|3585->2088|4695->3170|4724->3171|4753->3172|4792->3183|4821->3184|4850->3185|9125->7428
                    LINES: 19->1|22->1|24->3|24->3|24->3|36->15|36->15|36->15|36->15|36->15|36->15|36->15|36->15|36->15|36->15|36->15|36->15|36->15|36->15|36->15|36->15|36->15|36->15|71->50|71->50|71->50|71->50|71->50|71->50|72->51|72->51|72->51|72->51|72->51|72->51|90->69|90->69|90->69|90->69|90->69|90->69|167->146
                    -- GENERATED --
                */
            