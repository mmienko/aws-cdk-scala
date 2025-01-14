package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DeviceConfigurationProperty {

  def apply(
    challengeRequiredOnNewDevice: Option[Boolean] = None,
    deviceOnlyRememberedOnUserPrompt: Option[Boolean] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPool.DeviceConfigurationProperty =
    (new software.amazon.awscdk.services.cognito.CfnUserPool.DeviceConfigurationProperty.Builder)
      .challengeRequiredOnNewDevice(challengeRequiredOnNewDevice.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .deviceOnlyRememberedOnUserPrompt(deviceOnlyRememberedOnUserPrompt.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
