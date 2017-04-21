package tests

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scenarios._

class ViewScenariosTest extends Simulation {

  val httpConf =
    http.baseURL("http://localhost:3000")
      .header("Content-Type", "application/json")

  setUp(testScenario.viewScenarios.inject(atOnceUsers(10)))
    .protocols(httpConf)

}