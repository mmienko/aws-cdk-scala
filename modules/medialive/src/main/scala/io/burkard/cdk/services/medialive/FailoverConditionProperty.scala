package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FailoverConditionProperty {

  def apply(
    failoverConditionSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.FailoverConditionSettingsProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.FailoverConditionProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.FailoverConditionProperty.Builder)
      .failoverConditionSettings(failoverConditionSettings.orNull)
      .build()
}
