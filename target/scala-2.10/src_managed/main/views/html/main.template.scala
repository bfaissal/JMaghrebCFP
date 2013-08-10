
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,Html,Html,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(header: Html)(content: Html)(scripts: Html=Html("")):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.70*/("""

<!DOCTYPE html>

<html ng-app="JMAGHREB">
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        """),_display_(Seq[Any](/*8.10*/header)),format.raw/*8.16*/("""
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/main.css"))),format.raw/*9.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.54*/routes/*10.60*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*10.103*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*11.54*/routes/*11.60*/.Assets.at("stylesheets/bootstrap-responsive.min.css"))),format.raw/*11.114*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*12.59*/routes/*12.65*/.Assets.at("images/summertime_favicon.jpg"))),format.raw/*12.108*/("""">

    </head>
    <body >
        """),_display_(Seq[Any](/*16.10*/content)),format.raw/*16.17*/("""
        <script src=""""),_display_(Seq[Any](/*17.23*/routes/*17.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*17.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*18.23*/routes/*18.29*/.Assets.at("javascripts/angular.min.js"))),format.raw/*18.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*19.23*/routes/*19.29*/.Assets.at("javascripts/angular-resource.min.js"))),format.raw/*19.78*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*20.23*/routes/*20.29*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*20.71*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*21.23*/routes/*21.29*/.Assets.at("javascripts/app.js"))),format.raw/*21.61*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*22.23*/routes/*22.29*/.Assets.at("javascripts/directives.js"))),format.raw/*22.68*/("""" type="text/javascript"></script>
        """),_display_(Seq[Any](/*23.10*/scripts)),format.raw/*23.17*/("""
    </body>
</html>
"""))}
    }
    
    def render(title:String,header:Html,content:Html,scripts:Html): play.api.templates.Html = apply(title)(header)(content)(scripts)
    
    def f:((String) => (Html) => (Html) => (Html) => play.api.templates.Html) = (title) => (header) => (content) => (scripts) => apply(title)(header)(content)(scripts)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Aug 08 20:46:50 EDT 2013
                    SOURCE: /Users/faissalboutaounte/Sites/JMaghrebCFP/app/views/main.scala.html
                    HASH: b3316acb18ceea494eaa738fd0689fdb1d89bc1d
                    MATRIX: 519->1|664->69|770->140|796->145|849->163|876->169|965->223|979->229|1034->263|1126->319|1141->325|1207->368|1299->424|1314->430|1391->484|1488->545|1503->551|1569->594|1642->631|1671->638|1730->661|1745->667|1812->712|1905->769|1920->775|1982->815|2075->872|2090->878|2161->927|2254->984|2269->990|2333->1032|2426->1089|2441->1095|2495->1127|2588->1184|2603->1190|2664->1229|2744->1273|2773->1280
                    LINES: 19->1|22->1|28->7|28->7|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|33->12|33->12|33->12|37->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18|40->19|40->19|40->19|41->20|41->20|41->20|42->21|42->21|42->21|43->22|43->22|43->22|44->23|44->23
                    -- GENERATED --
                */
            