package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SnsPublishProps {

  def apply(
    message: software.amazon.awscdk.services.stepfunctions.TaskInput,
    topic: software.amazon.awscdk.services.sns.ITopic,
    subject: Option[String] = None,
    resultPath: Option[String] = None,
    resultSelector: Option[Map[String, _]] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    messageAttributes: Option[Map[String, _ <: software.amazon.awscdk.services.stepfunctions.tasks.MessageAttribute]] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    messagePerSubscriptionType: Option[Boolean] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.SnsPublishProps =
    (new software.amazon.awscdk.services.stepfunctions.tasks.SnsPublishProps.Builder)
      .message(message)
      .topic(topic)
      .subject(subject.orNull)
      .resultPath(resultPath.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .heartbeat(heartbeat.orNull)
      .integrationPattern(integrationPattern.orNull)
      .messageAttributes(messageAttributes.map(_.asJava).orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .messagePerSubscriptionType(messagePerSubscriptionType.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
