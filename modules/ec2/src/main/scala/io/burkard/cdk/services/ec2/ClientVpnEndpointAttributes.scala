package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ClientVpnEndpointAttributes {

  def apply(
    endpointId: Option[String] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None
  ): software.amazon.awscdk.services.ec2.ClientVpnEndpointAttributes =
    (new software.amazon.awscdk.services.ec2.ClientVpnEndpointAttributes.Builder)
      .endpointId(endpointId.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .build()
}