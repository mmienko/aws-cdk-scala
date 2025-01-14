package io.burkard.cdk.services.kendra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SalesforceKnowledgeArticleConfigurationProperty {

  def apply(
    includedStates: List[String],
    customKnowledgeArticleTypeConfigurations: Option[List[_]] = None,
    standardKnowledgeArticleTypeConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardKnowledgeArticleTypeConfigurationProperty] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceKnowledgeArticleConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceKnowledgeArticleConfigurationProperty.Builder)
      .includedStates(includedStates.asJava)
      .customKnowledgeArticleTypeConfigurations(customKnowledgeArticleTypeConfigurations.map(_.asJava).orNull)
      .standardKnowledgeArticleTypeConfiguration(standardKnowledgeArticleTypeConfiguration.orNull)
      .build()
}
