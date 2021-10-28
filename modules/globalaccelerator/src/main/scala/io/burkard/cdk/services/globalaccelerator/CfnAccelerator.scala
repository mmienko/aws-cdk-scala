package io.burkard.cdk.services.globalaccelerator

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAccelerator {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    enabled: Option[Boolean] = None,
    ipAddressType: Option[String] = None,
    ipAddresses: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.globalaccelerator.CfnAccelerator =
    software.amazon.awscdk.services.globalaccelerator.CfnAccelerator.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .ipAddressType(ipAddressType.orNull)
      .ipAddresses(ipAddresses.map(_.asJava).orNull)
      .build()
}