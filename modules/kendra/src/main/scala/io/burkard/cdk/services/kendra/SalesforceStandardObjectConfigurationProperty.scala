package io.burkard.cdk.services.kendra

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SalesforceStandardObjectConfigurationProperty {

  def apply(
    documentDataFieldName: Option[String] = None,
    fieldMappings: Option[List[_]] = None,
    name: Option[String] = None,
    documentTitleFieldName: Option[String] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardObjectConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardObjectConfigurationProperty.Builder)
      .documentDataFieldName(documentDataFieldName.orNull)
      .fieldMappings(fieldMappings.map(_.asJava).orNull)
      .name(name.orNull)
      .documentTitleFieldName(documentTitleFieldName.orNull)
      .build()
}