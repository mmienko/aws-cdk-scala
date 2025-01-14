package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BaselineEbsBandwidthMbpsRequestProperty {

  def apply(
    min: Option[Number] = None,
    max: Option[Number] = None
  ): software.amazon.awscdk.services.ec2.CfnSpotFleet.BaselineEbsBandwidthMbpsRequestProperty =
    (new software.amazon.awscdk.services.ec2.CfnSpotFleet.BaselineEbsBandwidthMbpsRequestProperty.Builder)
      .min(min.orNull)
      .max(max.orNull)
      .build()
}
