package io.burkard.cdk.services.stepfunctions

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BatchSubmitJobProps {

  def apply(
    jobName: Option[String] = None,
    containerOverrides: Option[software.amazon.awscdk.services.stepfunctions.tasks.BatchContainerOverrides] = None,
    attempts: Option[Number] = None,
    payload: Option[software.amazon.awscdk.services.stepfunctions.TaskInput] = None,
    jobQueueArn: Option[String] = None,
    resultPath: Option[String] = None,
    arraySize: Option[Number] = None,
    jobDefinitionArn: Option[String] = None,
    resultSelector: Option[Map[String, _]] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    dependsOn: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.BatchJobDependency]] = None,
    comment: Option[String] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJobProps =
    (new software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJobProps.Builder)
      .jobName(jobName.orNull)
      .containerOverrides(containerOverrides.orNull)
      .attempts(attempts.orNull)
      .payload(payload.orNull)
      .jobQueueArn(jobQueueArn.orNull)
      .resultPath(resultPath.orNull)
      .arraySize(arraySize.orNull)
      .jobDefinitionArn(jobDefinitionArn.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .heartbeat(heartbeat.orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .dependsOn(dependsOn.map(_.asJava).orNull)
      .comment(comment.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .build()
}