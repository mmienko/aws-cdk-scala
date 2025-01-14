package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FlowLog {

  def apply(
    internalResourceId: String,
    resourceType: software.amazon.awscdk.services.ec2.FlowLogResourceType,
    flowLogName: Option[String] = None,
    trafficType: Option[software.amazon.awscdk.services.ec2.FlowLogTrafficType] = None,
    destination: Option[software.amazon.awscdk.services.ec2.FlowLogDestination] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.FlowLog =
    software.amazon.awscdk.services.ec2.FlowLog.Builder
      .create(stackCtx, internalResourceId)
      .resourceType(resourceType)
      .flowLogName(flowLogName.orNull)
      .trafficType(trafficType.orNull)
      .destination(destination.orNull)
      .build()
}
