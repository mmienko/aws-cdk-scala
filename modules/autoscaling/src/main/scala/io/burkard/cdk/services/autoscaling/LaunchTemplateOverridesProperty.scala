package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LaunchTemplateOverridesProperty {

  def apply(
    instanceRequirements: Option[software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstanceRequirementsProperty] = None,
    weightedCapacity: Option[String] = None,
    launchTemplateSpecification: Option[software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateSpecificationProperty] = None,
    instanceType: Option[String] = None
  ): software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateOverridesProperty =
    (new software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateOverridesProperty.Builder)
      .instanceRequirements(instanceRequirements.orNull)
      .weightedCapacity(weightedCapacity.orNull)
      .launchTemplateSpecification(launchTemplateSpecification.orNull)
      .instanceType(instanceType.orNull)
      .build()
}
