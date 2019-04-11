package com.seon.performance.sso.scenarios

import com.seon.performance.sso.requests.{GetClientsRequest, GetIdentityResourcesRequest, GetProtectedResourcesRequest, GetRolesRequest, GetTokenRequest, GetUsersRequest}
import io.gatling.core.Predef.scenario

object SingleSignOnScenario {
  val singleSignOnScenario = scenario("Seon Single Sign On Scenario")
    .exec(GetTokenRequest.get_token)
    .exec(GetProtectedResourcesRequest.get_protected_resources)
    .exec(GetIdentityResourcesRequest.get_identity_resources)
    .exec(GetClientsRequest.get_all_clients)
    .exec(GetRolesRequest.get_all_roles)
    .exec((GetUsersRequest.get_all_users))
}
