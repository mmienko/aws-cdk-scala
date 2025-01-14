package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StopProps {

  def apply(
    topic: Option[software.amazon.awscdk.services.sns.ITopic] = None
  ): software.amazon.awscdk.services.ses.actions.StopProps =
    (new software.amazon.awscdk.services.ses.actions.StopProps.Builder)
      .topic(topic.orNull)
      .build()
}
