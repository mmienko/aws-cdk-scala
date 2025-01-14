package io.burkard.cdk.services.quicksight

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TypographyProperty {

  def apply(
    fontFamilies: Option[List[_]] = None
  ): software.amazon.awscdk.services.quicksight.CfnTheme.TypographyProperty =
    (new software.amazon.awscdk.services.quicksight.CfnTheme.TypographyProperty.Builder)
      .fontFamilies(fontFamilies.map(_.asJava).orNull)
      .build()
}
