
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

"""),_display_(Seq[Any](/*3.2*/main("JMaghreb Call For Paper")/*3.33*/{_display_(Seq[Any](format.raw/*3.34*/("""
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    """)))}/*5.6*/{_display_(Seq[Any](format.raw/*5.7*/("""
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
                            <td>"""),format.raw/*52.33*/("""{"""),format.raw/*52.34*/("""{"""),format.raw/*52.35*/("""aTrack.title"""),format.raw/*52.47*/("""}"""),format.raw/*52.48*/("""}"""),format.raw/*52.49*/("""</td>
                            <td>"""),format.raw/*53.33*/("""{"""),format.raw/*53.34*/("""{"""),format.raw/*53.35*/(""" aTrack.status == 2 ? 'Submitted' : 'In progress' """),format.raw/*53.85*/("""}"""),format.raw/*53.86*/("""}"""),format.raw/*53.87*/("""</td>
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
                                """),format.raw/*71.33*/("""{"""),format.raw/*71.34*/("""{"""),format.raw/*71.35*/("""message.msg"""),format.raw/*71.46*/("""}"""),format.raw/*71.47*/("""}"""),format.raw/*71.48*/("""
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
                            <label class="control-label" for="type">Session Track</label>
                            <div class="controls">
                                <select name="type" id="type" ng-required="true" class="input-xxlarge" ng-model="selected.type">
                                    <option value="0">Architecture and Security</option>
                                    <option value="3">Cloud &amp; BigData</option>
                                    
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
                                <select name="language" id="language" ng-required="true" class="input-xxlarge" ng-model="selected.level">
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
                                <!-- Abstract-->
                            <label class="control-label" for="abstract">Other Speakers</label>
                            <div class="controls">
                                <small class="help-block">Introduce emails of the other speakers. Note that they should have already created their accounts</small>
                                <button class="btn" value="add" ng-click="addOtherSpeaker(selected)" style="margin-bottom: 10px;">Add</button>
                                <div ng-repeat="oSpeaker in selected.others" style="margin-bottom: 10px;clear: both">
                                    <input ng-show="usersData[$index].fname == '' || usersData[$index].fname == undefined" type="email" id="speaker" ng-change="loadSpeakerInfo(oSpeaker.email,$index)" ng-model="oSpeaker.email" class="input-xxlarge"/>

                                    <div style="margin-top: 10px" ng-show="usersData[$index].fname != '' && usersData[$index].fname != undefined">

                                        <img style="float: left;margin-bottom: 10px;margin-right: 10px" width="100px" src="/images/"""),format.raw/*143.132*/("""{"""),format.raw/*143.133*/("""{"""),format.raw/*143.134*/(""" usersData[$index].image """),format.raw/*143.159*/("""}"""),format.raw/*143.160*/("""}"""),format.raw/*143.161*/("""" />
                                        <div>"""),format.raw/*144.46*/("""{"""),format.raw/*144.47*/("""{"""),format.raw/*144.48*/(""" usersData[$index].fname """),format.raw/*144.73*/("""}"""),format.raw/*144.74*/("""}"""),format.raw/*144.75*/(""" """),format.raw/*144.76*/("""{"""),format.raw/*144.77*/("""{"""),format.raw/*144.78*/(""" usersData[$index].lname """),format.raw/*144.103*/("""}"""),format.raw/*144.104*/("""}"""),format.raw/*144.105*/("""</div>

                                    </div>
                                    <a data-toggle="modal" href="#myModal" class="btn btn-lg" ng-click="deleteSpeakerConfirmation($index)"><span class="icon-remove"></span>Delete</a>
                                </div>
                            </div>
                        </div>


                        <div class="control-group">
                                <!-- Button -->
                            <div class="controls">
                                <button class="btn" ng-disabled="submissionForm.$invalid" ng-click="addTalk()">Save</button>
                                <button class="btn btn-danger"  ng-click="cancelAddTalk()">Cancel</button>
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
            <!-- Modal -->
        <div class="modal fade" id="myModal">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title">Confirm action</h4>
                    </div>
                    <div class="modal-body">
                        Are you sure you want to delete the entry ?
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        <button type="button" class="btn btn-primary" ng-click="deleteSpeaker()">Delete</button>
                    </div>
                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->
    </div>






""")))}/*195.2*/{_display_(Seq[Any](format.raw/*195.3*/("""

    <script src=""""),_display_(Seq[Any](/*197.19*/routes/*197.25*/.Assets.at("javascripts/typeahead.min.js"))),format.raw/*197.67*/("""" type="text/javascript"></script>
    <script src=""""),_display_(Seq[Any](/*198.19*/routes/*198.25*/.Assets.at("javascripts/hogan-2.0.0"))),format.raw/*198.62*/("""" type="text/javascript"></script>
""")))})),format.raw/*199.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.Html = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Aug 10 16:30:00 EDT 2013
                    SOURCE: /Users/faissalboutaounte/Sites/JMaghrebCFP/app/views/go.scala.html
                    HASH: 1795078bcbad90efd481fc104dd6e9c152eaab29
                    MATRIX: 502->1|596->18|633->21|672->52|710->53|808->134|845->135|1491->753|1520->754|1549->755|1588->766|1617->767|1646->768|1675->769|1704->770|1733->771|1772->782|1801->783|1830->784|1860->786|1889->787|1918->788|1955->797|1984->798|2013->799|3303->2061|3332->2062|3361->2063|3401->2075|3430->2076|3459->2077|3525->2115|3554->2116|3583->2117|3661->2167|3690->2168|3719->2169|4829->3251|4858->3252|4887->3253|4926->3264|4955->3265|4984->3266|9793->8045|9824->8046|9855->8047|9910->8072|9941->8073|9972->8074|10051->8124|10081->8125|10111->8126|10165->8151|10195->8152|10225->8153|10255->8154|10285->8155|10315->8156|10370->8181|10401->8182|10432->8183|12536->10268|12575->10269|12632->10289|12648->10295|12713->10337|12803->10390|12819->10396|12879->10433|12947->10469
                    LINES: 19->1|22->1|24->3|24->3|24->3|26->5|26->5|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|73->52|73->52|73->52|73->52|73->52|73->52|74->53|74->53|74->53|74->53|74->53|74->53|92->71|92->71|92->71|92->71|92->71|92->71|164->143|164->143|164->143|164->143|164->143|164->143|165->144|165->144|165->144|165->144|165->144|165->144|165->144|165->144|165->144|165->144|165->144|165->144|216->195|216->195|218->197|218->197|218->197|219->198|219->198|219->198|220->199
                    -- GENERATED --
                */
            