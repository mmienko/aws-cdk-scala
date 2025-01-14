package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object QueryStringKeyValueProperty {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.QueryStringKeyValueProperty =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.QueryStringKeyValueProperty.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
