package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnClientVpnTargetNetworkAssociationProps {

  def apply(
    clientVpnEndpointId: Option[String] = None,
    subnetId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociationProps =
    (new software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociationProps.Builder)
      .clientVpnEndpointId(clientVpnEndpointId.orNull)
      .subnetId(subnetId.orNull)
      .build()
}