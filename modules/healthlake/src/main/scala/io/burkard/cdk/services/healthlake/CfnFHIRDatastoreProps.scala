package io.burkard.cdk.services.healthlake

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFHIRDatastoreProps {

  def apply(
    datastoreTypeVersion: String,
    sseConfiguration: Option[software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.SseConfigurationProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    datastoreName: Option[String] = None,
    preloadDataConfig: Option[software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.PreloadDataConfigProperty] = None
  ): software.amazon.awscdk.services.healthlake.CfnFHIRDatastoreProps =
    (new software.amazon.awscdk.services.healthlake.CfnFHIRDatastoreProps.Builder)
      .datastoreTypeVersion(datastoreTypeVersion)
      .sseConfiguration(sseConfiguration.orNull)
      .tags(tags.map(_.asJava).orNull)
      .datastoreName(datastoreName.orNull)
      .preloadDataConfig(preloadDataConfig.orNull)
      .build()
}
