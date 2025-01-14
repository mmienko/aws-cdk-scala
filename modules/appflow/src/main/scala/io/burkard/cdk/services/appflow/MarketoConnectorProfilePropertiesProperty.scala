package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MarketoConnectorProfilePropertiesProperty {

  def apply(
    instanceUrl: String
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.MarketoConnectorProfilePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.MarketoConnectorProfilePropertiesProperty.Builder)
      .instanceUrl(instanceUrl)
      .build()
}
