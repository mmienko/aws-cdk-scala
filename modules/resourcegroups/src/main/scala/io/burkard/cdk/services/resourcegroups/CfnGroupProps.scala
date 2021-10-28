package io.burkard.cdk.services.resourcegroups

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnGroupProps {

  def apply(
    name: Option[String] = None,
    configuration: Option[List[_]] = None,
    resources: Option[List[String]] = None,
    resourceQuery: Option[software.amazon.awscdk.services.resourcegroups.CfnGroup.ResourceQueryProperty] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.resourcegroups.CfnGroupProps =
    (new software.amazon.awscdk.services.resourcegroups.CfnGroupProps.Builder)
      .name(name.orNull)
      .configuration(configuration.map(_.asJava).orNull)
      .resources(resources.map(_.asJava).orNull)
      .resourceQuery(resourceQuery.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}