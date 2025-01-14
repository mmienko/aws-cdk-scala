package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLocalGatewayRouteTableVPCAssociation {

  def apply(
    internalResourceId: String,
    vpcId: String,
    localGatewayRouteTableId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVPCAssociation =
    software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVPCAssociation.Builder
      .create(stackCtx, internalResourceId)
      .vpcId(vpcId)
      .localGatewayRouteTableId(localGatewayRouteTableId)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
