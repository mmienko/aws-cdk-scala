package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PrivateIpAddressSpecificationProperty {

  def apply(
    privateIpAddress: String,
    primary: Boolean
  ): software.amazon.awscdk.services.ec2.CfnInstance.PrivateIpAddressSpecificationProperty =
    (new software.amazon.awscdk.services.ec2.CfnInstance.PrivateIpAddressSpecificationProperty.Builder)
      .privateIpAddress(privateIpAddress)
      .primary(primary)
      .build()
}
