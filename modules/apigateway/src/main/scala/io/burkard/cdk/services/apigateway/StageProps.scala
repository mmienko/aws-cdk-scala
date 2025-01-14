package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StageProps {

  def apply(
    deployment: software.amazon.awscdk.services.apigateway.Deployment,
    throttlingBurstLimit: Option[Number] = None,
    clientCertificateId: Option[String] = None,
    description: Option[String] = None,
    tracingEnabled: Option[Boolean] = None,
    dataTraceEnabled: Option[Boolean] = None,
    cacheClusterEnabled: Option[Boolean] = None,
    loggingLevel: Option[software.amazon.awscdk.services.apigateway.MethodLoggingLevel] = None,
    stageName: Option[String] = None,
    throttlingRateLimit: Option[Number] = None,
    accessLogFormat: Option[software.amazon.awscdk.services.apigateway.AccessLogFormat] = None,
    cacheClusterSize: Option[String] = None,
    methodOptions: Option[Map[String, _ <: software.amazon.awscdk.services.apigateway.MethodDeploymentOptions]] = None,
    documentationVersion: Option[String] = None,
    variables: Option[Map[String, String]] = None,
    cacheDataEncrypted: Option[Boolean] = None,
    cacheTtl: Option[software.amazon.awscdk.Duration] = None,
    cachingEnabled: Option[Boolean] = None,
    accessLogDestination: Option[software.amazon.awscdk.services.apigateway.IAccessLogDestination] = None,
    metricsEnabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.apigateway.StageProps =
    (new software.amazon.awscdk.services.apigateway.StageProps.Builder)
      .deployment(deployment)
      .throttlingBurstLimit(throttlingBurstLimit.orNull)
      .clientCertificateId(clientCertificateId.orNull)
      .description(description.orNull)
      .tracingEnabled(tracingEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .dataTraceEnabled(dataTraceEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cacheClusterEnabled(cacheClusterEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .loggingLevel(loggingLevel.orNull)
      .stageName(stageName.orNull)
      .throttlingRateLimit(throttlingRateLimit.orNull)
      .accessLogFormat(accessLogFormat.orNull)
      .cacheClusterSize(cacheClusterSize.orNull)
      .methodOptions(methodOptions.map(_.asJava).orNull)
      .documentationVersion(documentationVersion.orNull)
      .variables(variables.map(_.asJava).orNull)
      .cacheDataEncrypted(cacheDataEncrypted.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cacheTtl(cacheTtl.orNull)
      .cachingEnabled(cachingEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .accessLogDestination(accessLogDestination.orNull)
      .metricsEnabled(metricsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
