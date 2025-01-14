package io.burkard.cdk.services.iot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDimension {

  def apply(
    internalResourceId: String,
    stringValues: List[String],
    `type`: String,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iot.CfnDimension =
    software.amazon.awscdk.services.iot.CfnDimension.Builder
      .create(stackCtx, internalResourceId)
      .stringValues(stringValues.asJava)
      .`type`(`type`)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
