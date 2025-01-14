package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricDimensionProperty {

  def apply(
    key: String,
    value: String
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.MetricDimensionProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.MetricDimensionProperty.Builder)
      .key(key)
      .value(value)
      .build()
}
