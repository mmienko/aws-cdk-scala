package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UtilizationScalingOptions {

  def apply(
    utilizationTarget: Number,
    disableScaleIn: Option[Boolean] = None,
    policyName: Option[String] = None,
    scaleOutCooldown: Option[software.amazon.awscdk.Duration] = None,
    scaleInCooldown: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.lambda.UtilizationScalingOptions =
    (new software.amazon.awscdk.services.lambda.UtilizationScalingOptions.Builder)
      .utilizationTarget(utilizationTarget)
      .disableScaleIn(disableScaleIn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .policyName(policyName.orNull)
      .scaleOutCooldown(scaleOutCooldown.orNull)
      .scaleInCooldown(scaleInCooldown.orNull)
      .build()
}
