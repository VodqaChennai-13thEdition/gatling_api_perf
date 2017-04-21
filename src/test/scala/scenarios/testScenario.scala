package scenarios

import io.gatling.core.Predef._
import requests.GetReqPage



object testScenario {

  val viewScenarios = scenario("Benchmarking all the view endpoints")
    .exec(GetReqPage.getActualAllocationValues)
}