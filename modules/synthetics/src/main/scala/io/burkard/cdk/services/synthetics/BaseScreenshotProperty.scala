package io.burkard.cdk.services.synthetics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BaseScreenshotProperty {

  def apply(
    screenshotName: String,
    ignoreCoordinates: Option[List[String]] = None
  ): software.amazon.awscdk.services.synthetics.CfnCanary.BaseScreenshotProperty =
    (new software.amazon.awscdk.services.synthetics.CfnCanary.BaseScreenshotProperty.Builder)
      .screenshotName(screenshotName)
      .ignoreCoordinates(ignoreCoordinates.map(_.asJava).orNull)
      .build()
}
