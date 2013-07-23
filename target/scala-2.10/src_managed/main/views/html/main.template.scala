
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Html,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(header: Html)(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.46*/("""

<!DOCTYPE html>

<html ng-app="JMAGHREB">
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        """),_display_(Seq[Any](/*8.10*/header)),format.raw/*8.16*/("""
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/main.css"))),format.raw/*9.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.54*/routes/*10.60*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*10.103*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*11.54*/routes/*11.60*/.Assets.at("stylesheets/bootstrap-responsive.min.css"))),format.raw/*11.114*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*12.59*/routes/*12.65*/.Assets.at("images/favicon.png"))),format.raw/*12.97*/("""">

    </head>
    <body >
        """),_display_(Seq[Any](/*16.10*/content)),format.raw/*16.17*/("""
        <script src=""""),_display_(Seq[Any](/*17.23*/routes/*17.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*17.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*18.23*/routes/*18.29*/.Assets.at("javascripts/angular.min.js"))),format.raw/*18.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*19.23*/routes/*19.29*/.Assets.at("javascripts/angular-resource.min.js"))),format.raw/*19.78*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*20.23*/routes/*20.29*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*20.71*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*21.23*/routes/*21.29*/.Assets.at("javascripts/app.js"))),format.raw/*21.61*/("""" type="text/javascript"></script>
    </body>
</html>
"""))}
    }
    
    def render(title:String,header:Html,content:Html): play.api.templates.Html = apply(title)(header)(content)
    
    def f:((String) => (Html) => (Html) => play.api.templates.Html) = (title) => (header) => (content) => apply(title)(header)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jul 23 14:38:08 EDT 2013
                    SOURCE: /Users/faissalboutaounte/Sites/JMaghrebCFP/app/views/main.scala.html
                    HASH: 09d769cc5916ef8808e42153c3a205e2bc4b75f1
                    MATRIX: 514->1|635->45|741->116|767->121|820->139|847->145|936->199|950->205|1005->239|1097->295|1112->301|1178->344|1270->400|1285->406|1362->460|1459->521|1474->527|1528->559|1601->596|1630->603|1689->626|1704->632|1771->677|1864->734|1879->740|1941->780|2034->837|2049->843|2120->892|2213->949|2228->955|2292->997|2385->1054|2400->1060|2454->1092
                    LINES: 19->1|22->1|28->7|28->7|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|33->12|33->12|33->12|37->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18|40->19|40->19|40->19|41->20|41->20|41->20|42->21|42->21|42->21
                    -- GENERATED --
                */
            