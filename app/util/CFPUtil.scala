package util

/**
 * Created with IntelliJ IDEA.
 * User: faissalboutaounte
 * Date: 13-07-25
 * Time: 19:10
 * To change this template use File | Settings | File Templates.
 */
object CFPUtil {
  def randomString(length: Int) = {
    val r = new scala.util.Random
    val sb = new StringBuilder
    for (i <- 1 to length) {
      sb.append(r.nextPrintableChar)
    }
    sb.toString.replace("+","B").replace("\"","_")
  }
}
