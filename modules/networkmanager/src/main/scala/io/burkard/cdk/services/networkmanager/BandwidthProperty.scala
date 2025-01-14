package io.burkard.cdk.services.networkmanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BandwidthProperty {

  def apply(
    uploadSpeed: Option[Number] = None,
    downloadSpeed: Option[Number] = None
  ): software.amazon.awscdk.services.networkmanager.CfnLink.BandwidthProperty =
    (new software.amazon.awscdk.services.networkmanager.CfnLink.BandwidthProperty.Builder)
      .uploadSpeed(uploadSpeed.orNull)
      .downloadSpeed(downloadSpeed.orNull)
      .build()
}
