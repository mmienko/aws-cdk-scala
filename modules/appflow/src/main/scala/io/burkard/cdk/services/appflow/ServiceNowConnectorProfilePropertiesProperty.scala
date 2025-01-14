package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ServiceNowConnectorProfilePropertiesProperty {

  def apply(
    instanceUrl: String
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.ServiceNowConnectorProfilePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.ServiceNowConnectorProfilePropertiesProperty.Builder)
      .instanceUrl(instanceUrl)
      .build()
}
