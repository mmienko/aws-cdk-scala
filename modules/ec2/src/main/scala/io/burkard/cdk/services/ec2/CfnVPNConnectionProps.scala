package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVPNConnectionProps {

  def apply(
    customerGatewayId: String,
    `type`: String,
    vpnGatewayId: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    transitGatewayId: Option[String] = None,
    vpnTunnelOptionsSpecifications: Option[List[_]] = None,
    staticRoutesOnly: Option[Boolean] = None
  ): software.amazon.awscdk.services.ec2.CfnVPNConnectionProps =
    (new software.amazon.awscdk.services.ec2.CfnVPNConnectionProps.Builder)
      .customerGatewayId(customerGatewayId)
      .`type`(`type`)
      .vpnGatewayId(vpnGatewayId.orNull)
      .tags(tags.map(_.asJava).orNull)
      .transitGatewayId(transitGatewayId.orNull)
      .vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications.map(_.asJava).orNull)
      .staticRoutesOnly(staticRoutesOnly.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
