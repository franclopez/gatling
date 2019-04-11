package com.seon.performance.sso.requests

import com.seon.performance.sso.config.Config.app_url_apis
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object GetRolesRequest {
  val sentHeaders = Map("Authorization" -> "bearer ${token}")

  val get_all_roles = exec(http("Get Roles request")
    .get(app_url_apis + "/api/Roles")
    .headers(sentHeaders)
    .check(status is 200));
}


