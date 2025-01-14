package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AlternatePathHintProperty {

  def apply(
    componentId: Option[String] = None,
    componentArn: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AlternatePathHintProperty =
    (new software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AlternatePathHintProperty.Builder)
      .componentId(componentId.orNull)
      .componentArn(componentArn.orNull)
      .build()
}
