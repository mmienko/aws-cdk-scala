package io.burkard.cdk.services.kendra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ServiceNowServiceCatalogConfigurationProperty {

  def apply(
    documentDataFieldName: String,
    fieldMappings: Option[List[_]] = None,
    includeAttachmentFilePatterns: Option[List[String]] = None,
    crawlAttachments: Option[Boolean] = None,
    excludeAttachmentFilePatterns: Option[List[String]] = None,
    documentTitleFieldName: Option[String] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowServiceCatalogConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowServiceCatalogConfigurationProperty.Builder)
      .documentDataFieldName(documentDataFieldName)
      .fieldMappings(fieldMappings.map(_.asJava).orNull)
      .includeAttachmentFilePatterns(includeAttachmentFilePatterns.map(_.asJava).orNull)
      .crawlAttachments(crawlAttachments.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .excludeAttachmentFilePatterns(excludeAttachmentFilePatterns.map(_.asJava).orNull)
      .documentTitleFieldName(documentTitleFieldName.orNull)
      .build()
}
