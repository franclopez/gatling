package com.seon.performance.sso.requests

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import com.seon.performance.sso.config.Config._

object GetTokenRequest {
  val get_token = http("Get Token Request").post(auth_url + "/connect/token")
    .formParam("client_id",client_id)
    .formParam("client_secret",client_secret)
    .formParam("grant_type","client_credentials")
    .check(status is 200)
    .check(jsonPath("$.access_token").saveAs("token"))
}
