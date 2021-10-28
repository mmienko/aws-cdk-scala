package io.burkard.cdk.services.iot

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TimestreamActionProperty {

  def apply(
    timestamp: Option[software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamTimestampProperty] = None,
    tableName: Option[String] = None,
    roleArn: Option[String] = None,
    dimensions: Option[List[_]] = None,
    databaseName: Option[String] = None,
    batchMode: Option[Boolean] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamActionProperty.Builder)
      .timestamp(timestamp.orNull)
      .tableName(tableName.orNull)
      .roleArn(roleArn.orNull)
      .dimensions(dimensions.map(_.asJava).orNull)
      .databaseName(databaseName.orNull)
      .batchMode(batchMode.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}