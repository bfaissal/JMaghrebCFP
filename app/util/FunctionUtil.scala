
/**
 * Created with IntelliJ IDEA.
 * User: faissalboutaounte
 * Date: 13-07-25
 * Time: 02:19
 * To change this template use File | Settings | File Templates.
 */
object FunctionUtil {
    def randomString(length: Int) = {
        val r = new scala.util.Random
        val sb = new StringBuilder
        for (i <- 1 to length) {
            sb.append(r.nextPrintableChar)
        }
        sb.toString
    }
}
