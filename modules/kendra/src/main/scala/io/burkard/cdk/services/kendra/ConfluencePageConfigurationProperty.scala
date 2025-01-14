package io.burkard.cdk.services.kendra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConfluencePageConfigurationProperty {

  def apply(
    pageFieldMappings: Option[List[_]] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.ConfluencePageConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.ConfluencePageConfigurationProperty.Builder)
      .pageFieldMappings(pageFieldMappings.map(_.asJava).orNull)
      .build()
}
