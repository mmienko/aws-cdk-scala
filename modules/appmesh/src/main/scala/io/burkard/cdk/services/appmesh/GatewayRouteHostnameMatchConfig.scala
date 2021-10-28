package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GatewayRouteHostnameMatchConfig {

  def apply(
    hostnameMatch: Option[software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteHostnameMatchProperty] = None
  ): software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatchConfig =
    (new software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatchConfig.Builder)
      .hostnameMatch(hostnameMatch.orNull)
      .build()
}