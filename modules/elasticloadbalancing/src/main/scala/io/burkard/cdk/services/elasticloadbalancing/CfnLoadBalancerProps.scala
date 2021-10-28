package io.burkard.cdk.services.elasticloadbalancing

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLoadBalancerProps {

  def apply(
    connectionDrainingPolicy: Option[software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionDrainingPolicyProperty] = None,
    crossZone: Option[Boolean] = None,
    listeners: Option[List[_]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    instances: Option[List[String]] = None,
    lbCookieStickinessPolicy: Option[List[_]] = None,
    scheme: Option[String] = None,
    loadBalancerName: Option[String] = None,
    securityGroups: Option[List[String]] = None,
    connectionSettings: Option[software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionSettingsProperty] = None,
    availabilityZones: Option[List[String]] = None,
    appCookieStickinessPolicy: Option[List[_]] = None,
    healthCheck: Option[software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.HealthCheckProperty] = None,
    subnets: Option[List[String]] = None,
    accessLoggingPolicy: Option[software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AccessLoggingPolicyProperty] = None,
    policies: Option[List[_]] = None
  ): software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps =
    (new software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps.Builder)
      .connectionDrainingPolicy(connectionDrainingPolicy.orNull)
      .crossZone(crossZone.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .listeners(listeners.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .instances(instances.map(_.asJava).orNull)
      .lbCookieStickinessPolicy(lbCookieStickinessPolicy.map(_.asJava).orNull)
      .scheme(scheme.orNull)
      .loadBalancerName(loadBalancerName.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .connectionSettings(connectionSettings.orNull)
      .availabilityZones(availabilityZones.map(_.asJava).orNull)
      .appCookieStickinessPolicy(appCookieStickinessPolicy.map(_.asJava).orNull)
      .healthCheck(healthCheck.orNull)
      .subnets(subnets.map(_.asJava).orNull)
      .accessLoggingPolicy(accessLoggingPolicy.orNull)
      .policies(policies.map(_.asJava).orNull)
      .build()
}