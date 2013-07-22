
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

"""),_display_(Seq[Any](/*3.2*/main("Welcome to Play 2.1")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
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
                                <a href="./index.html">Talks</a>
                            </li>
                            <li class="">
                                <a href="./getting-started.html">Profile</a>
                            </li>
                            <li class="">
                                <a href="logout">logout</a>
                            </li>

                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="span12">
                <br/>
                <br/>
                <br/>
                <br/>
                <table class="table table-striped" ng-show="login.talks.length > 0 ">
                    <thead>
                        <tr>
                            <th>Title</th>
                            <th>Abstract</th>
                            <th>Status</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr ng-repeat="aTrack in login.talks">
                            <td>"""),format.raw/*51.33*/("""{"""),format.raw/*51.34*/("""{"""),format.raw/*51.35*/("""aTrack.title"""),format.raw/*51.47*/("""}"""),format.raw/*51.48*/("""}"""),format.raw/*51.49*/("""</td>
                            <td>"""),format.raw/*52.33*/("""{"""),format.raw/*52.34*/("""{"""),format.raw/*52.35*/(""" aTrack.abstract """),format.raw/*52.52*/("""}"""),format.raw/*52.53*/("""}"""),format.raw/*52.54*/("""</td>
                            <td>"""),format.raw/*53.33*/("""{"""),format.raw/*53.34*/("""{"""),format.raw/*53.35*/(""" aTrack.status == 2 ? 'Submitted' : 'In progress' """),format.raw/*53.85*/("""}"""),format.raw/*53.86*/("""}"""),format.raw/*53.87*/("""</td>
                            <td>
                                <button class="btn" ng-click="editaTrack(aTrack)" value="edit"><span class="icon-edit"></span>Edit</button>
                            </td>
                        </tr>
                    </tbody>
                </table>
                <form class="form-horizontal" action='' method="POST">
                    <fieldset>
                        <div id="legend">
                            <legend class="">Submit  a talk</legend>
                        </div>
                        <div class="control-group" ng-show="message.msg != null">
                            <div class="alert" ng-class="message.type">
                                """),format.raw/*67.33*/("""{"""),format.raw/*67.34*/("""{"""),format.raw/*67.35*/("""message.msg"""),format.raw/*67.46*/("""}"""),format.raw/*67.47*/("""}"""),format.raw/*67.48*/("""
                            </div>
                        </div>
                        <div class="control-group">
                                <!-- Title -->
                            <label class="control-label"  for="title" >Title</label>
                            <div class="controls">
                                <input type="text" id="title" name="title" ng-model="selected.title" placeholder="" class="input-xlarge">
                            </div>
                        </div>

                        <div class="control-group">
                                <!-- Abstract-->
                            <label class="control-label" for="abstract">Abstract</label>
                            <div class="controls">
                                <textarea id="abstract" name="abstract" ng-model="selected.abstract" placeholder="" class="input-xlarge"></textarea>
                            </div>
                        </div>


                        <div class="control-group">
                                <!-- Button -->
                            <div class="controls">
                                <button class="btn" ng-click="addTalk()">Save</button>
                            </div>
                        </div>
                    </fieldset>
                </form>
            </div>
        </div>
    </div>
""")))})),format.raw/*98.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.Html = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jul 22 11:01:33 EDT 2013
                    SOURCE: /Users/faissalboutaounte/Sites/JMaghrebCFP/app/views/go.scala.html
                    HASH: 60bce76afd488ab2e404ee89ba7a436714d21865
                    MATRIX: 502->1|596->18|633->21|668->48|707->50|1353->668|1382->669|1411->670|1450->681|1479->682|1508->683|1537->684|1566->685|1595->686|1634->697|1663->698|1692->699|1722->701|1751->702|1780->703|1817->712|1846->713|1875->714|3222->2033|3251->2034|3280->2035|3320->2047|3349->2048|3378->2049|3444->2087|3473->2088|3502->2089|3547->2106|3576->2107|3605->2108|3671->2146|3700->2147|3729->2148|3807->2198|3836->2199|3865->2200|4620->2927|4649->2928|4678->2929|4717->2940|4746->2941|4775->2942|6177->4313
                    LINES: 19->1|22->1|24->3|24->3|24->3|36->15|36->15|36->15|36->15|36->15|36->15|36->15|36->15|36->15|36->15|36->15|36->15|36->15|36->15|36->15|36->15|36->15|36->15|72->51|72->51|72->51|72->51|72->51|72->51|73->52|73->52|73->52|73->52|73->52|73->52|74->53|74->53|74->53|74->53|74->53|74->53|88->67|88->67|88->67|88->67|88->67|88->67|119->98
                    -- GENERATED --
                */
            