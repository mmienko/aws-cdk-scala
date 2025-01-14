package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScheduleConfigProperty {

  def apply(
    scheduleExpression: String
  ): software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ScheduleConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ScheduleConfigProperty.Builder)
      .scheduleExpression(scheduleExpression)
      .build()
}
