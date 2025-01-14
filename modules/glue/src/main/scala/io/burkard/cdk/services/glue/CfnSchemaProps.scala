package io.burkard.cdk.services.glue

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSchemaProps {

  def apply(
    name: String,
    schemaDefinition: String,
    compatibility: String,
    dataFormat: String,
    registry: Option[software.amazon.awscdk.services.glue.CfnSchema.RegistryProperty] = None,
    description: Option[String] = None,
    checkpointVersion: Option[software.amazon.awscdk.services.glue.CfnSchema.SchemaVersionProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.glue.CfnSchemaProps =
    (new software.amazon.awscdk.services.glue.CfnSchemaProps.Builder)
      .name(name)
      .schemaDefinition(schemaDefinition)
      .compatibility(compatibility)
      .dataFormat(dataFormat)
      .registry(registry.orNull)
      .description(description.orNull)
      .checkpointVersion(checkpointVersion.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
