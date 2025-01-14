package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AudioSelectorProperty {

  def apply(
    name: Option[String] = None,
    selectorSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.AudioSelectorSettingsProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.AudioSelectorProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.AudioSelectorProperty.Builder)
      .name(name.orNull)
      .selectorSettings(selectorSettings.orNull)
      .build()
}
