package com.seon.performance.sso.requests

import com.seon.performance.sso.config.Config.app_url_apis
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object GetProtectedResourcesRequest {
  val sentHeaders = Map("Authorization" -> "bearer ${token}")

  val get_protected_resources = exec(http("Protected Resources")
    .get(app_url_apis + "/api/ProtectedResources")
    .headers(sentHeaders)
    .check(status is 200));

}
