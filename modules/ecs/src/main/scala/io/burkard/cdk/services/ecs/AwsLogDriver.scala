package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AwsLogDriver {

  def apply(
    streamPrefix: String,
    logRetention: Option[software.amazon.awscdk.services.logs.RetentionDays] = None,
    datetimeFormat: Option[String] = None,
    logGroup: Option[software.amazon.awscdk.services.logs.ILogGroup] = None,
    multilinePattern: Option[String] = None,
    mode: Option[software.amazon.awscdk.services.ecs.AwsLogDriverMode] = None
  ): software.amazon.awscdk.services.ecs.AwsLogDriver =
    software.amazon.awscdk.services.ecs.AwsLogDriver.Builder
      .create()
      .streamPrefix(streamPrefix)
      .logRetention(logRetention.orNull)
      .datetimeFormat(datetimeFormat.orNull)
      .logGroup(logGroup.orNull)
      .multilinePattern(multilinePattern.orNull)
      .mode(mode.orNull)
      .build()
}
