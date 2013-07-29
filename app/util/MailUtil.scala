package util

import play.api.libs.ws.WS
import play.api.libs.concurrent.Execution.Implicits._
import play.api.Logger
import play.api.Play

/**
 * Created with IntelliJ IDEA.
 * User: faissalboutaounte
 * Date: 13-07-23
 * Time: 19:05
 * To change this template use File | Settings | File Templates.
 */
object MailUtil {
      def send(to: String, subject : String, body: String, fname: String = ""){
        try{
        WS.url("https://sendgrid.com/api/mail.send.json?" +
          "api_user="+java.net.URLEncoder.encode(Play.current.configuration.getString("OPENSHIFT_GRID_MAIL_USER").getOrElse(""),"UTF-8")+
          "&api_key="+java.net.URLEncoder.encode(Play.current.configuration.getString("OPENSHIFT_GRID_MAIL_password").getOrElse(""),"UTF-8")+
          "&to="+java.net.URLEncoder.encode(to,"UTF-8")+
          "&toname="+java.net.URLEncoder.encode(fname ,"UTF-8")+
          "&subject="+ java.net.URLEncoder.encode(subject,"UTF-8")+
          "&from=info@moroccojug.org" +
          "&html="+java.net.URLEncoder.encode(body,"UTF-8")).get
        }
        catch {
          case e: Throwable => Logger.info("Email not sent")
        }
      }
}
