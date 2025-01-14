package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BatchJobProps {

  def apply(
    jobName: Option[String] = None,
    size: Option[Number] = None,
    event: Option[software.amazon.awscdk.services.events.RuleTargetInput] = None,
    deadLetterQueue: Option[software.amazon.awscdk.services.sqs.IQueue] = None,
    retryAttempts: Option[Number] = None,
    attempts: Option[Number] = None,
    maxEventAge: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.events.targets.BatchJobProps =
    (new software.amazon.awscdk.services.events.targets.BatchJobProps.Builder)
      .jobName(jobName.orNull)
      .size(size.orNull)
      .event(event.orNull)
      .deadLetterQueue(deadLetterQueue.orNull)
      .retryAttempts(retryAttempts.orNull)
      .attempts(attempts.orNull)
      .maxEventAge(maxEventAge.orNull)
      .build()
}
