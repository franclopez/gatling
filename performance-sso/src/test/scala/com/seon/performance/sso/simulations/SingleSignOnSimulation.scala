package com.seon.performance.sso.simulations


import com.seon.performance.sso.scenarios.SingleSignOnScenario
import io.gatling.core.Predef._
import com.seon.performance.sso.config.Config._

import scala.concurrent.duration._


class SingleSignOnSimulation extends Simulation {
  private val singleSignOnExec = SingleSignOnScenario.singleSignOnScenario
  setUp(
    singleSignOnExec.inject(
      rampUsers(users) during(rampUp seconds))).maxDuration(duration minutes)
}
