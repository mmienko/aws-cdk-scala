package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object H264FilterSettingsProperty {

  def apply(
    temporalFilterSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.TemporalFilterSettingsProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.H264FilterSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.H264FilterSettingsProperty.Builder)
      .temporalFilterSettings(temporalFilterSettings.orNull)
      .build()
}