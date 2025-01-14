package io.burkard.cdk.services.kendra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SalesforceConfigurationProperty {

  def apply(
    serverUrl: String,
    secretArn: String,
    excludeAttachmentFilePatterns: Option[List[String]] = None,
    includeAttachmentFilePatterns: Option[List[String]] = None,
    standardObjectAttachmentConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardObjectAttachmentConfigurationProperty] = None,
    standardObjectConfigurations: Option[List[_]] = None,
    knowledgeArticleConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceKnowledgeArticleConfigurationProperty] = None,
    crawlAttachments: Option[Boolean] = None,
    chatterFeedConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceChatterFeedConfigurationProperty] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceConfigurationProperty.Builder)
      .serverUrl(serverUrl)
      .secretArn(secretArn)
      .excludeAttachmentFilePatterns(excludeAttachmentFilePatterns.map(_.asJava).orNull)
      .includeAttachmentFilePatterns(includeAttachmentFilePatterns.map(_.asJava).orNull)
      .standardObjectAttachmentConfiguration(standardObjectAttachmentConfiguration.orNull)
      .standardObjectConfigurations(standardObjectConfigurations.map(_.asJava).orNull)
      .knowledgeArticleConfiguration(knowledgeArticleConfiguration.orNull)
      .crawlAttachments(crawlAttachments.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .chatterFeedConfiguration(chatterFeedConfiguration.orNull)
      .build()
}
