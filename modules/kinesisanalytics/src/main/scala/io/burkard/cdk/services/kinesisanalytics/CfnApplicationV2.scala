package io.burkard.cdk.services.kinesisanalytics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApplicationV2 {

  def apply(
    internalResourceId: String,
    serviceExecutionRole: String,
    runtimeEnvironment: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    applicationName: Option[String] = None,
    applicationConfiguration: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationConfigurationProperty] = None,
    applicationMode: Option[String] = None,
    applicationDescription: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2 =
    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.Builder
      .create(stackCtx, internalResourceId)
      .serviceExecutionRole(serviceExecutionRole)
      .runtimeEnvironment(runtimeEnvironment)
      .tags(tags.map(_.asJava).orNull)
      .applicationName(applicationName.orNull)
      .applicationConfiguration(applicationConfiguration.orNull)
      .applicationMode(applicationMode.orNull)
      .applicationDescription(applicationDescription.orNull)
      .build()
}
