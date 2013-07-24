package util

import play.api.libs.ws.WS
import play.api.libs.concurrent.Execution.Implicits._

/**
 * Created with IntelliJ IDEA.
 * User: faissalboutaounte
 * Date: 13-07-23
 * Time: 19:05
 * To change this template use File | Settings | File Templates.
 */
object MailUtil {
      def send(to: String, subject : String, body: String, fname: String){
        println("OPENSHIFT_GRID_MAIL_USER ::::::> "+System.getenv("OPENSHIFT_GRID_MAIL_USER"))
        WS.url("https://sendgrid.com/api/mail.send.json?" +
          "api_user="+java.net.URLEncoder.encode(System.getenv("OPENSHIFT_GRID_MAIL_USER"),"UTF-8")+
          "&api_key="+java.net.URLEncoder.encode(System.getenv("OPENSHIFT_GRID_MAIL_password"),"UTF-8")+
          "&to="+java.net.URLEncoder.encode(to,"UTF-8")+
          "&toname="+java.net.URLEncoder.encode(fname ,"UTF-8")+
          "&subject="+ java.net.URLEncoder.encode(subject,"UTF-8")+
          "&from=info@moroccojug.org" +
          "&html="+java.net.URLEncoder.encode(body,"UTF-8")).get().map(response => println("=========> "+response.json.as[String]))
      }
}
