package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FlowLogOptions {

  def apply(
    trafficType: Option[software.amazon.awscdk.services.ec2.FlowLogTrafficType] = None,
    destination: Option[software.amazon.awscdk.services.ec2.FlowLogDestination] = None
  ): software.amazon.awscdk.services.ec2.FlowLogOptions =
    (new software.amazon.awscdk.services.ec2.FlowLogOptions.Builder)
      .trafficType(trafficType.orNull)
      .destination(destination.orNull)
      .build()
}
