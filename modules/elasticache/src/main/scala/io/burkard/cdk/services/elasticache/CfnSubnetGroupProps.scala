package io.burkard.cdk.services.elasticache

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSubnetGroupProps {

  def apply(
    subnetIds: Option[List[String]] = None,
    cacheSubnetGroupName: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.elasticache.CfnSubnetGroupProps =
    (new software.amazon.awscdk.services.elasticache.CfnSubnetGroupProps.Builder)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .cacheSubnetGroupName(cacheSubnetGroupName.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}