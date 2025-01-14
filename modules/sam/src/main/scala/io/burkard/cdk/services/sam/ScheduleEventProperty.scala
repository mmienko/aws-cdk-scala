package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScheduleEventProperty {

  def apply(
    schedule: String,
    input: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnStateMachine.ScheduleEventProperty =
    (new software.amazon.awscdk.services.sam.CfnStateMachine.ScheduleEventProperty.Builder)
      .schedule(schedule)
      .input(input.orNull)
      .build()
}
