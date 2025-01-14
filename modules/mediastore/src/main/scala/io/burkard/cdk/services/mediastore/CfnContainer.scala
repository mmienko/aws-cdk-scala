package io.burkard.cdk.services.mediastore

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnContainer {

  def apply(
    internalResourceId: String,
    containerName: String,
    metricPolicy: Option[software.amazon.awscdk.services.mediastore.CfnContainer.MetricPolicyProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    lifecyclePolicy: Option[String] = None,
    corsPolicy: Option[List[_]] = None,
    accessLoggingEnabled: Option[Boolean] = None,
    policy: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.mediastore.CfnContainer =
    software.amazon.awscdk.services.mediastore.CfnContainer.Builder
      .create(stackCtx, internalResourceId)
      .containerName(containerName)
      .metricPolicy(metricPolicy.orNull)
      .tags(tags.map(_.asJava).orNull)
      .lifecyclePolicy(lifecyclePolicy.orNull)
      .corsPolicy(corsPolicy.map(_.asJava).orNull)
      .accessLoggingEnabled(accessLoggingEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .policy(policy.orNull)
      .build()
}
