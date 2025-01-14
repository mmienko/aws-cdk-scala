package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SingularConnectorProfileCredentialsProperty {

  def apply(
    apiKey: String
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.SingularConnectorProfileCredentialsProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.SingularConnectorProfileCredentialsProperty.Builder)
      .apiKey(apiKey)
      .build()
}
