package io.burkard.cdk.services.stepfunctions

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SageMakerUpdateEndpoint {

  def apply(
    internalResourceId: String,
    resultPath: Option[String] = None,
    endpointConfigName: Option[String] = None,
    resultSelector: Option[Map[String, _]] = None,
    endpointName: Option[String] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.tasks.SageMakerUpdateEndpoint =
    software.amazon.awscdk.services.stepfunctions.tasks.SageMakerUpdateEndpoint.Builder
      .create(stackCtx, internalResourceId)
      .resultPath(resultPath.orNull)
      .endpointConfigName(endpointConfigName.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .endpointName(endpointName.orNull)
      .heartbeat(heartbeat.orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .build()
}