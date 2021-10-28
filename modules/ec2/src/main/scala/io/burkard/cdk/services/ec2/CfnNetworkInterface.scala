package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnNetworkInterface {

  def apply(
    internalResourceId: String,
    interfaceType: Option[String] = None,
    ipv6Addresses: Option[List[_]] = None,
    ipv6AddressCount: Option[Number] = None,
    sourceDestCheck: Option[Boolean] = None,
    groupSet: Option[List[String]] = None,
    secondaryPrivateIpAddressCount: Option[Number] = None,
    privateIpAddress: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    subnetId: Option[String] = None,
    privateIpAddresses: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnNetworkInterface =
    software.amazon.awscdk.services.ec2.CfnNetworkInterface.Builder
      .create(stackCtx, internalResourceId)
      .interfaceType(interfaceType.orNull)
      .ipv6Addresses(ipv6Addresses.map(_.asJava).orNull)
      .ipv6AddressCount(ipv6AddressCount.orNull)
      .sourceDestCheck(sourceDestCheck.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .groupSet(groupSet.map(_.asJava).orNull)
      .secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount.orNull)
      .privateIpAddress(privateIpAddress.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .subnetId(subnetId.orNull)
      .privateIpAddresses(privateIpAddresses.map(_.asJava).orNull)
      .build()
}