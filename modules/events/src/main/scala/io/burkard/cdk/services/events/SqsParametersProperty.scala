package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SqsParametersProperty {

  def apply(
    messageGroupId: String
  ): software.amazon.awscdk.services.events.CfnRule.SqsParametersProperty =
    (new software.amazon.awscdk.services.events.CfnRule.SqsParametersProperty.Builder)
      .messageGroupId(messageGroupId)
      .build()
}
