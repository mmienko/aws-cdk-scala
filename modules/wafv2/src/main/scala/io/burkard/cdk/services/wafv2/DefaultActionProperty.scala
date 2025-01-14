package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DefaultActionProperty {

  def apply(
    block: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.BlockActionProperty] = None,
    allow: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.AllowActionProperty] = None
  ): software.amazon.awscdk.services.wafv2.CfnWebACL.DefaultActionProperty =
    (new software.amazon.awscdk.services.wafv2.CfnWebACL.DefaultActionProperty.Builder)
      .block(block.orNull)
      .allow(allow.orNull)
      .build()
}
