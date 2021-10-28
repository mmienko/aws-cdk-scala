package io.burkard.cdk.services.iotwireless

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnServiceProfile {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    loRaWan: Option[software.amazon.awscdk.services.iotwireless.CfnServiceProfile.LoRaWANServiceProfileProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iotwireless.CfnServiceProfile =
    software.amazon.awscdk.services.iotwireless.CfnServiceProfile.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .loRaWan(loRaWan.orNull)
      .build()
}