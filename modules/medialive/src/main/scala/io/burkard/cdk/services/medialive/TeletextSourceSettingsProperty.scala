package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TeletextSourceSettingsProperty {

  def apply(
    pageNumber: Option[String] = None,
    outputRectangle: Option[software.amazon.awscdk.services.medialive.CfnChannel.CaptionRectangleProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.TeletextSourceSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.TeletextSourceSettingsProperty.Builder)
      .pageNumber(pageNumber.orNull)
      .outputRectangle(outputRectangle.orNull)
      .build()
}
