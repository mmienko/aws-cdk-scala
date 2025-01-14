package io.burkard.cdk.services.globalaccelerator

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NetworkLoadBalancerEndpoint {

  def apply(
    loadBalancer: software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer,
    weight: Option[Number] = None
  ): software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpoint =
    software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpoint.Builder
      .create(loadBalancer)
      .weight(weight.orNull)
      .build()
}
