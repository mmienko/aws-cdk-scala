package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object WavSettingsProperty {

  def apply(
    codingMode: Option[String] = None,
    bitDepth: Option[Number] = None,
    sampleRate: Option[Number] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.WavSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.WavSettingsProperty.Builder)
      .codingMode(codingMode.orNull)
      .bitDepth(bitDepth.orNull)
      .sampleRate(sampleRate.orNull)
      .build()
}
