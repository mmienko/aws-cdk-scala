package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DatadogConnectorProfileCredentialsProperty {

  def apply(
    applicationKey: Option[String] = None,
    apiKey: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.DatadogConnectorProfileCredentialsProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.DatadogConnectorProfileCredentialsProperty.Builder)
      .applicationKey(applicationKey.orNull)
      .apiKey(apiKey.orNull)
      .build()
}