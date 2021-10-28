package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Sns {

  def apply(
    encoding: Option[software.amazon.awscdk.services.ses.actions.EmailEncoding] = None,
    topic: Option[software.amazon.awscdk.services.sns.ITopic] = None
  ): software.amazon.awscdk.services.ses.actions.Sns =
    software.amazon.awscdk.services.ses.actions.Sns.Builder
      .create()
      .encoding(encoding.orNull)
      .topic(topic.orNull)
      .build()
}