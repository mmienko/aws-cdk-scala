package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InterfaceVpcEndpointAttributes {

  def apply(
    port: Number,
    vpcEndpointId: String,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None
  ): software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAttributes =
    (new software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAttributes.Builder)
      .port(port)
      .vpcEndpointId(vpcEndpointId)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .build()
}
