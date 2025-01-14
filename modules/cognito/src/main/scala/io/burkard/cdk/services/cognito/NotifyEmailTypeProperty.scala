package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NotifyEmailTypeProperty {

  def apply(
    subject: String,
    htmlBody: Option[String] = None,
    textBody: Option[String] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty =
    (new software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty.Builder)
      .subject(subject)
      .htmlBody(htmlBody.orNull)
      .textBody(textBody.orNull)
      .build()
}
