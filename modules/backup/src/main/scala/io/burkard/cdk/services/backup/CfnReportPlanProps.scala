package io.burkard.cdk.services.backup

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnReportPlanProps {

  def apply(
    reportSetting: AnyRef,
    reportDeliveryChannel: AnyRef,
    reportPlanName: Option[String] = None,
    reportPlanDescription: Option[String] = None,
    reportPlanTags: Option[List[_]] = None
  ): software.amazon.awscdk.services.backup.CfnReportPlanProps =
    (new software.amazon.awscdk.services.backup.CfnReportPlanProps.Builder)
      .reportSetting(reportSetting)
      .reportDeliveryChannel(reportDeliveryChannel)
      .reportPlanName(reportPlanName.orNull)
      .reportPlanDescription(reportPlanDescription.orNull)
      .reportPlanTags(reportPlanTags.map(_.asJava).orNull)
      .build()
}
