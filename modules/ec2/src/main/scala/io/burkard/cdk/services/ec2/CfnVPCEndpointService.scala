package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnVPCEndpointService {

  def apply(
    internalResourceId: String,
    gatewayLoadBalancerArns: Option[List[String]] = None,
    networkLoadBalancerArns: Option[List[String]] = None,
    acceptanceRequired: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnVPCEndpointService =
    software.amazon.awscdk.services.ec2.CfnVPCEndpointService.Builder
      .create(stackCtx, internalResourceId)
      .gatewayLoadBalancerArns(gatewayLoadBalancerArns.map(_.asJava).orNull)
      .networkLoadBalancerArns(networkLoadBalancerArns.map(_.asJava).orNull)
      .acceptanceRequired(acceptanceRequired.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}