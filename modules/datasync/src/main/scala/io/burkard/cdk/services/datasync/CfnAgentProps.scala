package io.burkard.cdk.services.datasync

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAgentProps {

  def apply(
    activationKey: String,
    subnetArns: Option[List[String]] = None,
    agentName: Option[String] = None,
    vpcEndpointId: Option[String] = None,
    securityGroupArns: Option[List[String]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.datasync.CfnAgentProps =
    (new software.amazon.awscdk.services.datasync.CfnAgentProps.Builder)
      .activationKey(activationKey)
      .subnetArns(subnetArns.map(_.asJava).orNull)
      .agentName(agentName.orNull)
      .vpcEndpointId(vpcEndpointId.orNull)
      .securityGroupArns(securityGroupArns.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
