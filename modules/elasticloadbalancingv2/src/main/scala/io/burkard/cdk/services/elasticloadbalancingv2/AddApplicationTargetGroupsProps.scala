package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AddApplicationTargetGroupsProps {

  def apply(
    targetGroups: List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup],
    conditions: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition]] = None,
    priority: Option[Number] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetGroupsProps =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetGroupsProps.Builder)
      .targetGroups(targetGroups.asJava)
      .conditions(conditions.map(_.asJava).orNull)
      .priority(priority.orNull)
      .build()
}
