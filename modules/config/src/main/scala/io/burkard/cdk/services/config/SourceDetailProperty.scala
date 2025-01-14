package io.burkard.cdk.services.config

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SourceDetailProperty {

  def apply(
    eventSource: String,
    messageType: String,
    maximumExecutionFrequency: Option[String] = None
  ): software.amazon.awscdk.services.config.CfnConfigRule.SourceDetailProperty =
    (new software.amazon.awscdk.services.config.CfnConfigRule.SourceDetailProperty.Builder)
      .eventSource(eventSource)
      .messageType(messageType)
      .maximumExecutionFrequency(maximumExecutionFrequency.orNull)
      .build()
}
