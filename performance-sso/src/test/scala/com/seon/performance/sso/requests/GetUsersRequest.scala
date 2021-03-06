package com.seon.performance.sso.requests

import com.seon.performance.sso.config.Config.app_url_apis
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object GetUsersRequest {
  val sentHeaders = Map("Authorization" -> "bearer ${token}")

  val get_all_users = exec(http("Get Users request")
    .get(app_url_apis + "/api/Users")
    .headers(sentHeaders)
    .check(status is 200));
}
