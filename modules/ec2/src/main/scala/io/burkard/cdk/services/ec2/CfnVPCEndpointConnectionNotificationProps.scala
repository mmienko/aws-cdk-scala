package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVPCEndpointConnectionNotificationProps {

  def apply(
    connectionNotificationArn: String,
    connectionEvents: List[String],
    serviceId: Option[String] = None,
    vpcEndpointId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotificationProps =
    (new software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotificationProps.Builder)
      .connectionNotificationArn(connectionNotificationArn)
      .connectionEvents(connectionEvents.asJava)
      .serviceId(serviceId.orNull)
      .vpcEndpointId(vpcEndpointId.orNull)
      .build()
}
