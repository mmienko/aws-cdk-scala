package io.burkard.cdk.services.iotanalytics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDatastoreProps {

  def apply(
    datastorePartitions: Option[software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastorePartitionsProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    retentionPeriod: Option[software.amazon.awscdk.services.iotanalytics.CfnDatastore.RetentionPeriodProperty] = None,
    datastoreName: Option[String] = None,
    datastoreStorage: Option[software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastoreStorageProperty] = None,
    fileFormatConfiguration: Option[software.amazon.awscdk.services.iotanalytics.CfnDatastore.FileFormatConfigurationProperty] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDatastoreProps =
    (new software.amazon.awscdk.services.iotanalytics.CfnDatastoreProps.Builder)
      .datastorePartitions(datastorePartitions.orNull)
      .tags(tags.map(_.asJava).orNull)
      .retentionPeriod(retentionPeriod.orNull)
      .datastoreName(datastoreName.orNull)
      .datastoreStorage(datastoreStorage.orNull)
      .fileFormatConfiguration(fileFormatConfiguration.orNull)
      .build()
}
