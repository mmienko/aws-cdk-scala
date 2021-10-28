package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GrpcGatewayRouteMetadataProperty {

  def apply(
    name: Option[String] = None,
    `match`: Option[software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteMetadataMatchProperty] = None,
    invert: Option[Boolean] = None
  ): software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteMetadataProperty =
    (new software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteMetadataProperty.Builder)
      .name(name.orNull)
      .`match`(`match`.orNull)
      .invert(invert.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}