package io.burkard.cdk.services.certificatemanager

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAccount {

  def apply(
    internalResourceId: String,
    expiryEventsConfiguration: Option[software.amazon.awscdk.services.certificatemanager.CfnAccount.ExpiryEventsConfigurationProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.certificatemanager.CfnAccount =
    software.amazon.awscdk.services.certificatemanager.CfnAccount.Builder
      .create(stackCtx, internalResourceId)
      .expiryEventsConfiguration(expiryEventsConfiguration.orNull)
      .build()
}