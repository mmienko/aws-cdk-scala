package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApplicationSettingsProps {

  def apply(
    applicationId: String,
    cloudWatchMetricsEnabled: Option[Boolean] = None,
    campaignHook: Option[software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.CampaignHookProperty] = None,
    limits: Option[software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.LimitsProperty] = None,
    quietTime: Option[software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.QuietTimeProperty] = None
  ): software.amazon.awscdk.services.pinpoint.CfnApplicationSettingsProps =
    (new software.amazon.awscdk.services.pinpoint.CfnApplicationSettingsProps.Builder)
      .applicationId(applicationId)
      .cloudWatchMetricsEnabled(cloudWatchMetricsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .campaignHook(campaignHook.orNull)
      .limits(limits.orNull)
      .quietTime(quietTime.orNull)
      .build()
}
