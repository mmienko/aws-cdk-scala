package io.burkard.cdk.pipelines

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3SourceOptions {

  def apply(
    actionName: Option[String] = None,
    trigger: Option[software.amazon.awscdk.services.codepipeline.actions.S3Trigger] = None
  ): software.amazon.awscdk.pipelines.S3SourceOptions =
    (new software.amazon.awscdk.pipelines.S3SourceOptions.Builder)
      .actionName(actionName.orNull)
      .trigger(trigger.orNull)
      .build()
}
