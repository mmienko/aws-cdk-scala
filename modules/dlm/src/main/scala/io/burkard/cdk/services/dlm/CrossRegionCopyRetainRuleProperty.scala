package io.burkard.cdk.services.dlm

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CrossRegionCopyRetainRuleProperty {

  def apply(
    intervalUnit: String,
    interval: Number
  ): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty =
    (new software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty.Builder)
      .intervalUnit(intervalUnit)
      .interval(interval)
      .build()
}
