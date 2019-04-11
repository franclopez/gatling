package com.seon.performance.sso.requests

import com.seon.performance.sso.config.Config.app_url_apis
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object GetIdentityResourcesRequest {
  val sentHeaders = Map("Authorization" -> "bearer ${token}")

  val get_identity_resources = exec(http("Identity Resources")
    .get(app_url_apis + "/api/IdentityResources")
    .headers(sentHeaders)
    .check(status is 200));
}
