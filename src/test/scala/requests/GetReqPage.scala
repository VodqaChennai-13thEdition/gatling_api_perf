package requests

import io.gatling.core.Predef._
import io.gatling.http.Predef._


object GetReqPage {
  val getActualAllocationValues = exec(http("Get the actual allocation values for all the markets")
    .get("/posts")
    .header("test", "value")
    .check(status.is(200)))
}