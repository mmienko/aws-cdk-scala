package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ExcludedRuleProperty {

  def apply(
    name: String
  ): software.amazon.awscdk.services.wafv2.CfnWebACL.ExcludedRuleProperty =
    (new software.amazon.awscdk.services.wafv2.CfnWebACL.ExcludedRuleProperty.Builder)
      .name(name)
      .build()
}
