package io.burkard.cdk.services.sam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnHttpApiProps {

  def apply(
    corsConfiguration0: Option[Boolean] = None,
    corsConfiguration1: Option[software.amazon.awscdk.services.sam.CfnHttpApi.CorsConfigurationObjectProperty] = None,
    defaultRouteSettings: Option[software.amazon.awscdk.services.sam.CfnHttpApi.RouteSettingsProperty] = None,
    domain: Option[software.amazon.awscdk.services.sam.CfnHttpApi.HttpApiDomainConfigurationProperty] = None,
    failOnWarnings: Option[Boolean] = None,
    definitionBody: Option[AnyRef] = None,
    stageName: Option[String] = None,
    disableExecuteApiEndpoint: Option[Boolean] = None,
    accessLogSetting: Option[software.amazon.awscdk.services.sam.CfnHttpApi.AccessLogSettingProperty] = None,
    definitionUri0: Option[String] = None,
    definitionUri1: Option[software.amazon.awscdk.services.sam.CfnHttpApi.S3LocationProperty] = None,
    stageVariables: Option[Map[String, String]] = None,
    auth: Option[software.amazon.awscdk.services.sam.CfnHttpApi.HttpApiAuthProperty] = None,
    routeSettings: Option[software.amazon.awscdk.services.sam.CfnHttpApi.RouteSettingsProperty] = None,
    description: Option[String] = None,
    tags: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.sam.CfnHttpApiProps =
    (new software.amazon.awscdk.services.sam.CfnHttpApiProps.Builder)
      .corsConfiguration(corsConfiguration0.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .corsConfiguration(corsConfiguration1.orNull)
      .defaultRouteSettings(defaultRouteSettings.orNull)
      .domain(domain.orNull)
      .failOnWarnings(failOnWarnings.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .definitionBody(definitionBody.orNull)
      .stageName(stageName.orNull)
      .disableExecuteApiEndpoint(disableExecuteApiEndpoint.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .accessLogSetting(accessLogSetting.orNull)
      .definitionUri(definitionUri0.orNull)
      .definitionUri(definitionUri1.orNull)
      .stageVariables(stageVariables.map(_.asJava).orNull)
      .auth(auth.orNull)
      .routeSettings(routeSettings.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
