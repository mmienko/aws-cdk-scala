package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricDimensionProperty {

  def apply(
    key: String,
    value: String
  ): software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.MetricDimensionProperty =
    (new software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.MetricDimensionProperty.Builder)
      .key(key)
      .value(value)
      .build()
}
