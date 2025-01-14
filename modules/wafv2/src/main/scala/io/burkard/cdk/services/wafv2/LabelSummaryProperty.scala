package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LabelSummaryProperty {

  def apply(
    name: Option[String] = None
  ): software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelSummaryProperty =
    (new software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelSummaryProperty.Builder)
      .name(name.orNull)
      .build()
}
