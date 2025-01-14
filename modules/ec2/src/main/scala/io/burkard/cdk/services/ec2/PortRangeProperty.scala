package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PortRangeProperty {

  def apply(
    to: Option[Number] = None,
    from: Option[Number] = None
  ): software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.PortRangeProperty =
    (new software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.PortRangeProperty.Builder)
      .to(to.orNull)
      .from(from.orNull)
      .build()
}
