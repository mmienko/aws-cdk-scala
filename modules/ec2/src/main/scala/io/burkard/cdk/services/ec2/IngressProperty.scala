package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IngressProperty {

  def apply(
    ipProtocol: String,
    sourceSecurityGroupName: Option[String] = None,
    sourcePrefixListId: Option[String] = None,
    sourceSecurityGroupId: Option[String] = None,
    toPort: Option[Number] = None,
    description: Option[String] = None,
    sourceSecurityGroupOwnerId: Option[String] = None,
    fromPort: Option[Number] = None,
    cidrIp: Option[String] = None,
    cidrIpv6: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnSecurityGroup.IngressProperty =
    (new software.amazon.awscdk.services.ec2.CfnSecurityGroup.IngressProperty.Builder)
      .ipProtocol(ipProtocol)
      .sourceSecurityGroupName(sourceSecurityGroupName.orNull)
      .sourcePrefixListId(sourcePrefixListId.orNull)
      .sourceSecurityGroupId(sourceSecurityGroupId.orNull)
      .toPort(toPort.orNull)
      .description(description.orNull)
      .sourceSecurityGroupOwnerId(sourceSecurityGroupOwnerId.orNull)
      .fromPort(fromPort.orNull)
      .cidrIp(cidrIp.orNull)
      .cidrIpv6(cidrIpv6.orNull)
      .build()
}
