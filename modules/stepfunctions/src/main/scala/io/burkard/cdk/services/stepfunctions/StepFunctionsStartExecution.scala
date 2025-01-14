package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StepFunctionsStartExecution {

  def apply(
    internalResourceId: String,
    stateMachine: software.amazon.awscdk.services.stepfunctions.IStateMachine,
    name: Option[String] = None,
    resultPath: Option[String] = None,
    input: Option[software.amazon.awscdk.services.stepfunctions.TaskInput] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    resultSelector: Option[Map[String, _]] = None,
    associateWithParent: Option[Boolean] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsStartExecution =
    software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsStartExecution.Builder
      .create(stackCtx, internalResourceId)
      .stateMachine(stateMachine)
      .name(name.orNull)
      .resultPath(resultPath.orNull)
      .input(input.orNull)
      .heartbeat(heartbeat.orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .associateWithParent(associateWithParent.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .build()
}
