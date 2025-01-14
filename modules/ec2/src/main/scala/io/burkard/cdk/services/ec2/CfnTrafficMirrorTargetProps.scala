package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTrafficMirrorTargetProps {

  def apply(
    networkLoadBalancerArn: Option[String] = None,
    networkInterfaceId: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.ec2.CfnTrafficMirrorTargetProps =
    (new software.amazon.awscdk.services.ec2.CfnTrafficMirrorTargetProps.Builder)
      .networkLoadBalancerArn(networkLoadBalancerArn.orNull)
      .networkInterfaceId(networkInterfaceId.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
