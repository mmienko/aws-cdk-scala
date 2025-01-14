package io.burkard.cdk.services.timestream

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTableProps {

  def apply(
    databaseName: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    retentionProperties: Option[AnyRef] = None,
    tableName: Option[String] = None
  ): software.amazon.awscdk.services.timestream.CfnTableProps =
    (new software.amazon.awscdk.services.timestream.CfnTableProps.Builder)
      .databaseName(databaseName)
      .tags(tags.map(_.asJava).orNull)
      .retentionProperties(retentionProperties.orNull)
      .tableName(tableName.orNull)
      .build()
}
