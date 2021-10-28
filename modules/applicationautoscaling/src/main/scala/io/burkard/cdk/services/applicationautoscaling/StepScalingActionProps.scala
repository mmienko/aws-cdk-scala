package io.burkard.cdk.services.applicationautoscaling

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StepScalingActionProps {

  def apply(
    minAdjustmentMagnitude: Option[Number] = None,
    metricAggregationType: Option[software.amazon.awscdk.services.applicationautoscaling.MetricAggregationType] = None,
    policyName: Option[String] = None,
    scalingTarget: Option[software.amazon.awscdk.services.applicationautoscaling.IScalableTarget] = None,
    cooldown: Option[software.amazon.awscdk.Duration] = None,
    adjustmentType: Option[software.amazon.awscdk.services.applicationautoscaling.AdjustmentType] = None
  ): software.amazon.awscdk.services.applicationautoscaling.StepScalingActionProps =
    (new software.amazon.awscdk.services.applicationautoscaling.StepScalingActionProps.Builder)
      .minAdjustmentMagnitude(minAdjustmentMagnitude.orNull)
      .metricAggregationType(metricAggregationType.orNull)
      .policyName(policyName.orNull)
      .scalingTarget(scalingTarget.orNull)
      .cooldown(cooldown.orNull)
      .adjustmentType(adjustmentType.orNull)
      .build()
}