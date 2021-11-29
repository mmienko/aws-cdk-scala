package io.burkard.cdk.services.iotwireless

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFuotaTask {

  def apply(
    internalResourceId: String,
    loRaWan: software.amazon.awscdk.services.iotwireless.CfnFuotaTask.LoRaWANProperty,
    firmwareUpdateRole: String,
    firmwareUpdateImage: String,
    name: Option[String] = None,
    disassociateMulticastGroup: Option[String] = None,
    associateWirelessDevice: Option[String] = None,
    associateMulticastGroup: Option[String] = None,
    disassociateWirelessDevice: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iotwireless.CfnFuotaTask =
    software.amazon.awscdk.services.iotwireless.CfnFuotaTask.Builder
      .create(stackCtx, internalResourceId)
      .loRaWan(loRaWan)
      .firmwareUpdateRole(firmwareUpdateRole)
      .firmwareUpdateImage(firmwareUpdateImage)
      .name(name.orNull)
      .disassociateMulticastGroup(disassociateMulticastGroup.orNull)
      .associateWirelessDevice(associateWirelessDevice.orNull)
      .associateMulticastGroup(associateMulticastGroup.orNull)
      .disassociateWirelessDevice(disassociateWirelessDevice.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}