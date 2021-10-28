package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object WebhookAuthConfigurationProperty {

  def apply(
    allowedIpRange: Option[String] = None,
    secretToken: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookAuthConfigurationProperty =
    (new software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookAuthConfigurationProperty.Builder)
      .allowedIpRange(allowedIpRange.orNull)
      .secretToken(secretToken.orNull)
      .build()
}