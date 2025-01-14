package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTransitGatewayRoute {

  def apply(
    internalResourceId: String,
    transitGatewayRouteTableId: String,
    transitGatewayAttachmentId: Option[String] = None,
    destinationCidrBlock: Option[String] = None,
    blackhole: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnTransitGatewayRoute =
    software.amazon.awscdk.services.ec2.CfnTransitGatewayRoute.Builder
      .create(stackCtx, internalResourceId)
      .transitGatewayRouteTableId(transitGatewayRouteTableId)
      .transitGatewayAttachmentId(transitGatewayAttachmentId.orNull)
      .destinationCidrBlock(destinationCidrBlock.orNull)
      .blackhole(blackhole.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
