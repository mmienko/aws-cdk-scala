package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VpnTunnelOption {

  def apply(
    preSharedKey: Option[String] = None,
    tunnelInsideCidr: Option[String] = None
  ): software.amazon.awscdk.services.ec2.VpnTunnelOption =
    (new software.amazon.awscdk.services.ec2.VpnTunnelOption.Builder)
      .preSharedKey(preSharedKey.orNull)
      .tunnelInsideCidr(tunnelInsideCidr.orNull)
      .build()
}
