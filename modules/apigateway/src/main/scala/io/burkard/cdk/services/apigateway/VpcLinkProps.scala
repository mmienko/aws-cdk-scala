package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VpcLinkProps {

  def apply(
    targets: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer]] = None,
    description: Option[String] = None,
    vpcLinkName: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.VpcLinkProps =
    (new software.amazon.awscdk.services.apigateway.VpcLinkProps.Builder)
      .targets(targets.map(_.asJava).orNull)
      .description(description.orNull)
      .vpcLinkName(vpcLinkName.orNull)
      .build()
}
