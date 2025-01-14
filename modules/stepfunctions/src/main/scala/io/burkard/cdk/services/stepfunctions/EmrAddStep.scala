package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EmrAddStep {

  def apply(
    internalResourceId: String,
    name: String,
    clusterId: String,
    jar: String,
    actionOnFailure: Option[software.amazon.awscdk.services.stepfunctions.tasks.ActionOnFailure] = None,
    properties: Option[Map[String, String]] = None,
    resultSelector: Option[Map[String, _]] = None,
    args: Option[List[String]] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    resultPath: Option[String] = None,
    mainClass: Option[String] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.tasks.EmrAddStep =
    software.amazon.awscdk.services.stepfunctions.tasks.EmrAddStep.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .clusterId(clusterId)
      .jar(jar)
      .actionOnFailure(actionOnFailure.orNull)
      .properties(properties.map(_.asJava).orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .args(args.map(_.asJava).orNull)
      .heartbeat(heartbeat.orNull)
      .resultPath(resultPath.orNull)
      .mainClass(mainClass.orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .build()
}
