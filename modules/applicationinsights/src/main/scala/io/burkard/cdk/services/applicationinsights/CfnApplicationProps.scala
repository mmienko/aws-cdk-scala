package io.burkard.cdk.services.applicationinsights

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApplicationProps {

  def apply(
    resourceGroupName: String,
    cweMonitorEnabled: Option[Boolean] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    componentMonitoringSettings: Option[List[_]] = None,
    logPatternSets: Option[List[_]] = None,
    customComponents: Option[List[_]] = None,
    opsItemSnsTopicArn: Option[String] = None,
    autoConfigurationEnabled: Option[Boolean] = None,
    opsCenterEnabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.applicationinsights.CfnApplicationProps =
    (new software.amazon.awscdk.services.applicationinsights.CfnApplicationProps.Builder)
      .resourceGroupName(resourceGroupName)
      .cweMonitorEnabled(cweMonitorEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .tags(tags.map(_.asJava).orNull)
      .componentMonitoringSettings(componentMonitoringSettings.map(_.asJava).orNull)
      .logPatternSets(logPatternSets.map(_.asJava).orNull)
      .customComponents(customComponents.map(_.asJava).orNull)
      .opsItemSnsTopicArn(opsItemSnsTopicArn.orNull)
      .autoConfigurationEnabled(autoConfigurationEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .opsCenterEnabled(opsCenterEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
