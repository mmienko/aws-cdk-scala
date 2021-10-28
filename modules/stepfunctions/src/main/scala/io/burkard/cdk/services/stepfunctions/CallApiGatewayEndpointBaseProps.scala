package io.burkard.cdk.services.stepfunctions

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CallApiGatewayEndpointBaseProps {

  def apply(
    method: Option[software.amazon.awscdk.services.stepfunctions.tasks.HttpMethod] = None,
    apiPath: Option[String] = None,
    resultPath: Option[String] = None,
    authType: Option[software.amazon.awscdk.services.stepfunctions.tasks.AuthType] = None,
    resultSelector: Option[Map[String, _]] = None,
    queryParameters: Option[software.amazon.awscdk.services.stepfunctions.TaskInput] = None,
    headers: Option[software.amazon.awscdk.services.stepfunctions.TaskInput] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    requestBody: Option[software.amazon.awscdk.services.stepfunctions.TaskInput] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayEndpointBaseProps =
    (new software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayEndpointBaseProps.Builder)
      .method(method.orNull)
      .apiPath(apiPath.orNull)
      .resultPath(resultPath.orNull)
      .authType(authType.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .queryParameters(queryParameters.orNull)
      .headers(headers.orNull)
      .heartbeat(heartbeat.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .requestBody(requestBody.orNull)
      .integrationPattern(integrationPattern.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .build()
}