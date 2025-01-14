package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEgressOnlyInternetGatewayProps {

  def apply(
    vpcId: String
  ): software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGatewayProps =
    (new software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGatewayProps.Builder)
      .vpcId(vpcId)
      .build()
}
