package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NetworkInterfaceCountRequestProperty {

  def apply(
    min: Option[Number] = None,
    max: Option[Number] = None
  ): software.amazon.awscdk.services.ec2.CfnSpotFleet.NetworkInterfaceCountRequestProperty =
    (new software.amazon.awscdk.services.ec2.CfnSpotFleet.NetworkInterfaceCountRequestProperty.Builder)
      .min(min.orNull)
      .max(max.orNull)
      .build()
}