package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CloudWatchLogsLogGroupProperty {

  def apply(
    logGroupArn: String
  ): software.amazon.awscdk.services.sam.CfnStateMachine.CloudWatchLogsLogGroupProperty =
    (new software.amazon.awscdk.services.sam.CfnStateMachine.CloudWatchLogsLogGroupProperty.Builder)
      .logGroupArn(logGroupArn)
      .build()
}
