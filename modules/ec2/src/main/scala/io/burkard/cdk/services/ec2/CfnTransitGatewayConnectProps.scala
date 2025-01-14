package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTransitGatewayConnectProps {

  def apply(
    options: software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty,
    transportTransitGatewayAttachmentId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.ec2.CfnTransitGatewayConnectProps =
    (new software.amazon.awscdk.services.ec2.CfnTransitGatewayConnectProps.Builder)
      .options(options)
      .transportTransitGatewayAttachmentId(transportTransitGatewayAttachmentId)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
