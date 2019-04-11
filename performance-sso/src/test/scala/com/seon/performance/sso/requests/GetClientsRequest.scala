package com.seon.performance.sso.requests

import com.seon.performance.sso.config.Config.app_url_apis
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object GetClientsRequest {

  val sentHeaders = Map("Authorization" -> "bearer ${token}")

  val get_all_clients = exec(http("Get Clients Request")
    .get(app_url_apis + "/api/Clients")
    .headers(sentHeaders)
    .check(status is 200));
}

