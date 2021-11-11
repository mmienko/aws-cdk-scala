package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AddApplicationTargetGroupsProps {

  def apply(
    conditions: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition]] = None,
    priority: Option[Number] = None,
    pathPattern: Option[String] = None,
    hostHeader: Option[String] = None,
    targetGroups: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup]] = None,
    pathPatterns: Option[List[String]] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetGroupsProps =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetGroupsProps.Builder)
      .conditions(conditions.map(_.asJava).orNull)
      .priority(priority.orNull)
      .pathPattern(pathPattern.orNull)
      .hostHeader(hostHeader.orNull)
      .targetGroups(targetGroups.map(_.asJava).orNull)
      .pathPatterns(pathPatterns.map(_.asJava).orNull)
      .build()
}
