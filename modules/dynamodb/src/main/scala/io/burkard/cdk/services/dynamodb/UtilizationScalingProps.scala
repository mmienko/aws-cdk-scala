package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UtilizationScalingProps {

  def apply(
    targetUtilizationPercent: Number,
    disableScaleIn: Option[Boolean] = None,
    policyName: Option[String] = None,
    scaleInCooldown: Option[software.amazon.awscdk.Duration] = None,
    scaleOutCooldown: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.dynamodb.UtilizationScalingProps =
    (new software.amazon.awscdk.services.dynamodb.UtilizationScalingProps.Builder)
      .targetUtilizationPercent(targetUtilizationPercent)
      .disableScaleIn(disableScaleIn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .policyName(policyName.orNull)
      .scaleInCooldown(scaleInCooldown.orNull)
      .scaleOutCooldown(scaleOutCooldown.orNull)
      .build()
}
