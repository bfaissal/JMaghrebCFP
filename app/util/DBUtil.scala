package util

import com.mongodb.casbah.Imports._
/**
 * Created with IntelliJ IDEA.
 * User: faissalboutaounte
 * Date: 13-06-30
 * Time: 12:45
 * To change this template use File | Settings | File Templates.
 */
object DBUtil {
        val client = MongoClient("localhost",27017)
        val db = client("test")
        val speakers = db("speakers")
}
