package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InstanceIpv6AddressProperty {

  def apply(
    ipv6Address: String
  ): software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceIpv6AddressProperty =
    (new software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceIpv6AddressProperty.Builder)
      .ipv6Address(ipv6Address)
      .build()
}
