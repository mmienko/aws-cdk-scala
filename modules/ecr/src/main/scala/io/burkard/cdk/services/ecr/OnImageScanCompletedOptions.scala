package io.burkard.cdk.services.ecr

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OnImageScanCompletedOptions {

  def apply(
    ruleName: Option[String] = None,
    description: Option[String] = None,
    eventPattern: Option[software.amazon.awscdk.services.events.EventPattern] = None,
    target: Option[software.amazon.awscdk.services.events.IRuleTarget] = None,
    imageTags: Option[List[String]] = None
  ): software.amazon.awscdk.services.ecr.OnImageScanCompletedOptions =
    (new software.amazon.awscdk.services.ecr.OnImageScanCompletedOptions.Builder)
      .ruleName(ruleName.orNull)
      .description(description.orNull)
      .eventPattern(eventPattern.orNull)
      .target(target.orNull)
      .imageTags(imageTags.map(_.asJava).orNull)
      .build()
}
