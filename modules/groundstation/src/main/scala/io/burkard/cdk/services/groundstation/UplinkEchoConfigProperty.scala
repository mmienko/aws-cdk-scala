package io.burkard.cdk.services.groundstation

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UplinkEchoConfigProperty {

  def apply(
    antennaUplinkConfigArn: Option[String] = None,
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.groundstation.CfnConfig.UplinkEchoConfigProperty =
    (new software.amazon.awscdk.services.groundstation.CfnConfig.UplinkEchoConfigProperty.Builder)
      .antennaUplinkConfigArn(antennaUplinkConfigArn.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
