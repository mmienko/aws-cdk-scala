package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CompromisedCredentialsActionsTypeProperty {

  def apply(
    eventAction: String
  ): software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsActionsTypeProperty =
    (new software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsActionsTypeProperty.Builder)
      .eventAction(eventAction)
      .build()
}
