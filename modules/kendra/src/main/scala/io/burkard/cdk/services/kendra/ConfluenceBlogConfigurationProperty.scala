package io.burkard.cdk.services.kendra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConfluenceBlogConfigurationProperty {

  def apply(
    blogFieldMappings: Option[List[_]] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceBlogConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceBlogConfigurationProperty.Builder)
      .blogFieldMappings(blogFieldMappings.map(_.asJava).orNull)
      .build()
}
