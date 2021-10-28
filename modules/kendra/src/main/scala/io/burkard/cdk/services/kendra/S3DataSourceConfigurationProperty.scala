package io.burkard.cdk.services.kendra

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3DataSourceConfigurationProperty {

  def apply(
    exclusionPatterns: Option[List[String]] = None,
    accessControlListConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.AccessControlListConfigurationProperty] = None,
    inclusionPrefixes: Option[List[String]] = None,
    inclusionPatterns: Option[List[String]] = None,
    documentsMetadataConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.DocumentsMetadataConfigurationProperty] = None,
    bucketName: Option[String] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.S3DataSourceConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.S3DataSourceConfigurationProperty.Builder)
      .exclusionPatterns(exclusionPatterns.map(_.asJava).orNull)
      .accessControlListConfiguration(accessControlListConfiguration.orNull)
      .inclusionPrefixes(inclusionPrefixes.map(_.asJava).orNull)
      .inclusionPatterns(inclusionPatterns.map(_.asJava).orNull)
      .documentsMetadataConfiguration(documentsMetadataConfiguration.orNull)
      .bucketName(bucketName.orNull)
      .build()
}