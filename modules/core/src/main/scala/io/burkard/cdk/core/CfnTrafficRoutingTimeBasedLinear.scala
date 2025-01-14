package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTrafficRoutingTimeBasedLinear {

  def apply(
    bakeTimeMins: Option[Number] = None,
    stepPercentage: Option[Number] = None
  ): software.amazon.awscdk.CfnTrafficRoutingTimeBasedLinear =
    (new software.amazon.awscdk.CfnTrafficRoutingTimeBasedLinear.Builder)
      .bakeTimeMins(bakeTimeMins.orNull)
      .stepPercentage(stepPercentage.orNull)
      .build()
}
