package io.burkard.cdk.services.athena

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDataCatalogProps {

  def apply(
    name: String,
    `type`: String,
    parameters: Option[Map[String, String]] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.athena.CfnDataCatalogProps =
    (new software.amazon.awscdk.services.athena.CfnDataCatalogProps.Builder)
      .name(name)
      .`type`(`type`)
      .parameters(parameters.map(_.asJava).orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
