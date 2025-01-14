package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Scte35TimeSignalAposProperty {

  def apply(
    adAvailOffset: Option[Number] = None,
    webDeliveryAllowedFlag: Option[String] = None,
    noRegionalBlackoutFlag: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.Scte35TimeSignalAposProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.Scte35TimeSignalAposProperty.Builder)
      .adAvailOffset(adAvailOffset.orNull)
      .webDeliveryAllowedFlag(webDeliveryAllowedFlag.orNull)
      .noRegionalBlackoutFlag(noRegionalBlackoutFlag.orNull)
      .build()
}
