package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StepFunctionsTaskConfig {

  def apply(
    metricDimensions: Option[Map[String, _]] = None,
    resourceArn: Option[String] = None,
    metricPrefixPlural: Option[String] = None,
    metricPrefixSingular: Option[String] = None,
    policyStatements: Option[List[_ <: software.amazon.awscdk.services.iam.PolicyStatement]] = None,
    parameters: Option[Map[String, _]] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.stepfunctions.StepFunctionsTaskConfig =
    (new software.amazon.awscdk.services.stepfunctions.StepFunctionsTaskConfig.Builder)
      .metricDimensions(metricDimensions.map(_.asJava).orNull)
      .resourceArn(resourceArn.orNull)
      .metricPrefixPlural(metricPrefixPlural.orNull)
      .metricPrefixSingular(metricPrefixSingular.orNull)
      .policyStatements(policyStatements.map(_.asJava).orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .heartbeat(heartbeat.orNull)
      .build()
}
