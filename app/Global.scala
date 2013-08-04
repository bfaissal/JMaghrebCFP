/**
 * Created with IntelliJ IDEA.
 * User: faissalboutaounte
 * Date: 13-07-24
 * Time: 18:08
 * To change this template use File | Settings | File Templates.
 */

import controllers.Application
import play.api.mvc._
import play.api.{Logger, GlobalSettings}

object Global extends WithFilters(AuthorizedFilter("index", "createSpeaker", "editSpeaker", "getSpeaker", "go","profile")) with GlobalSettings {
  override def onStop(app: play.api.Application) = {
    Logger.info("Shutdown ...")
  }

  override def onStart(app: play.api.Application) {
    Logger.info("Started ...")
  }

}

object AuthorizedFilter {
  def apply(actionNames: String*) = new AuthorizedFilter(actionNames)
}

class AuthorizedFilter(actionNames: Seq[String]) extends Filter {

  val timeout: Long = 3600000

  override def apply(next: RequestHeader => Result)(request: RequestHeader): Result = {
    val sessionVariable = "lastAccessedTime"
    if (shouldSessionBeExtended(request)) {
      if ((System.currentTimeMillis() - request.session.get(sessionVariable).getOrElse(System.currentTimeMillis().toString).toLong) > timeout)
        return Application.Redirect("/").withNewSession
      next(request).withSession(request.session + (sessionVariable -> ("" + System.currentTimeMillis())))
    }
    else next(request)

  }

  private def shouldSessionBeExtended(request: RequestHeader) = {
    val actionInvoked: String = request.tags.getOrElse(play.api.Routes.ROUTE_ACTION_METHOD, "")
    actionNames.contains(actionInvoked)
  }
}