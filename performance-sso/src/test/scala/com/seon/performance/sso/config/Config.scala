package com.seon.performance.sso.config

object Config {
  val auth_url = "https://dev-id.seon.com"
  //val auth_url = "https://localhost:5001"
  val app_url_apis = "https://dev-id-manager-api.seon.com"
  //val app_url_apis = "https://localhost:5003"
  val users = Integer.getInteger("users", 500).toInt
  val rampUp = Integer.getInteger("rampup", 60).toInt
  val duration = Integer.getInteger( "duration",  5).toInt
  val throughput = Integer.getInteger("throughput", 100).toInt
  val client_id ="a05e4573-e1bf-c7e0-754f-e261fecddfc6"
  val client_secret = "e929f1d2-5694-f56d-edf1-26d5f0c7dc60"
  //val client_id  = "machine-client"
  //val client_secret  = "d8583e10-1e0f-a4a5-daef-0f24a5bf0b12"
}

