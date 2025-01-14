package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnNetworkInterfaceProps {

  def apply(
    subnetId: String,
    interfaceType: Option[String] = None,
    ipv6Addresses: Option[List[_]] = None,
    ipv6AddressCount: Option[Number] = None,
    sourceDestCheck: Option[Boolean] = None,
    groupSet: Option[List[String]] = None,
    secondaryPrivateIpAddressCount: Option[Number] = None,
    privateIpAddress: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    privateIpAddresses: Option[List[_]] = None
  ): software.amazon.awscdk.services.ec2.CfnNetworkInterfaceProps =
    (new software.amazon.awscdk.services.ec2.CfnNetworkInterfaceProps.Builder)
      .subnetId(subnetId)
      .interfaceType(interfaceType.orNull)
      .ipv6Addresses(ipv6Addresses.map(_.asJava).orNull)
      .ipv6AddressCount(ipv6AddressCount.orNull)
      .sourceDestCheck(sourceDestCheck.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .groupSet(groupSet.map(_.asJava).orNull)
      .secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount.orNull)
      .privateIpAddress(privateIpAddress.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .privateIpAddresses(privateIpAddresses.map(_.asJava).orNull)
      .build()
}
