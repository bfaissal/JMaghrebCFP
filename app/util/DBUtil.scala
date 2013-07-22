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
        val client = MongoClient(System.getenv("OPENSHIFT_MONGODB_DB_HOST"),Integer.parseInt(System.getenv("OPENSHIFT_MONGODB_DB_PORT")))
        val db = client("test")
        val speakers = db("speakers")
}
