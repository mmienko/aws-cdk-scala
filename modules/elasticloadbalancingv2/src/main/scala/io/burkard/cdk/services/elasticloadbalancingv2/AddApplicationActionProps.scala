package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AddApplicationActionProps {

  def apply(
    action: software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction,
    conditions: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition]] = None,
    priority: Option[Number] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationActionProps =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationActionProps.Builder)
      .action(action)
      .conditions(conditions.map(_.asJava).orNull)
      .priority(priority.orNull)
      .build()
}
