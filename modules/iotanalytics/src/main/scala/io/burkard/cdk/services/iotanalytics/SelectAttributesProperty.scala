package io.burkard.cdk.services.iotanalytics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SelectAttributesProperty {

  def apply(
    name: Option[String] = None,
    attributes: Option[List[String]] = None,
    next: Option[String] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnPipeline.SelectAttributesProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnPipeline.SelectAttributesProperty.Builder)
      .name(name.orNull)
      .attributes(attributes.map(_.asJava).orNull)
      .next(next.orNull)
      .build()
}
