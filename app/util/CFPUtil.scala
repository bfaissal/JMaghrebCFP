package util

import java.util.UUID

/**
 * Created with IntelliJ IDEA.
 * User: faissalboutaounte
 * Date: 13-07-25
 * Time: 19:10
 * To change this template use File | Settings | File Templates.
 */
object CFPUtil {
  def randomString() = {
    UUID.randomUUID().toString
  }
}
