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
        val client = {println("=================> "+System.getenv("OPENSHIFT_MONGODB_DB_HOST")+" // "+System.getenv("OPENSHIFT_MONGODB_DB_PORT")); MongoClient(System.getenv("OPENSHIFT_MONGODB_DB_HOST"),Integer.parseInt(System.getenv("OPENSHIFT_MONGODB_DB_PORT")))}
        val db = {val db = client("jmaghrebcfp");/*db.authenticate("admin", "nhCD2lGrPUit");*/ db }
        val speakers = db("speakers")
}
