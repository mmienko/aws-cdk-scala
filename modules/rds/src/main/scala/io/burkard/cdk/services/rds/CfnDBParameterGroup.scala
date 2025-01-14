package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDBParameterGroup {

  def apply(
    internalResourceId: String,
    family: String,
    description: String,
    parameters: Option[Map[String, String]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.rds.CfnDBParameterGroup =
    software.amazon.awscdk.services.rds.CfnDBParameterGroup.Builder
      .create(stackCtx, internalResourceId)
      .family(family)
      .description(description)
      .parameters(parameters.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
