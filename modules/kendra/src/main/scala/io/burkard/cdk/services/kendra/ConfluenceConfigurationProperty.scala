package io.burkard.cdk.services.kendra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConfluenceConfigurationProperty {

  def apply(
    serverUrl: String,
    version: String,
    secretArn: String,
    exclusionPatterns: Option[List[String]] = None,
    attachmentConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceAttachmentConfigurationProperty] = None,
    vpcConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceVpcConfigurationProperty] = None,
    inclusionPatterns: Option[List[String]] = None,
    pageConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.ConfluencePageConfigurationProperty] = None,
    blogConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceBlogConfigurationProperty] = None,
    spaceConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceSpaceConfigurationProperty] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceConfigurationProperty.Builder)
      .serverUrl(serverUrl)
      .version(version)
      .secretArn(secretArn)
      .exclusionPatterns(exclusionPatterns.map(_.asJava).orNull)
      .attachmentConfiguration(attachmentConfiguration.orNull)
      .vpcConfiguration(vpcConfiguration.orNull)
      .inclusionPatterns(inclusionPatterns.map(_.asJava).orNull)
      .pageConfiguration(pageConfiguration.orNull)
      .blogConfiguration(blogConfiguration.orNull)
      .spaceConfiguration(spaceConfiguration.orNull)
      .build()
}
