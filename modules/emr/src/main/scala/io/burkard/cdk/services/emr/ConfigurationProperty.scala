package io.burkard.cdk.services.emr

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConfigurationProperty {

  def apply(
    configurationProperties: Option[Map[String, String]] = None,
    configurations: Option[List[_]] = None,
    classification: Option[String] = None
  ): software.amazon.awscdk.services.emr.CfnCluster.ConfigurationProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.ConfigurationProperty.Builder)
      .configurationProperties(configurationProperties.map(_.asJava).orNull)
      .configurations(configurations.map(_.asJava).orNull)
      .classification(classification.orNull)
      .build()
}
