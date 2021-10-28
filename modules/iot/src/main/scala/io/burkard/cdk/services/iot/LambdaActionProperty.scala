package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LambdaActionProperty {

  def apply(
    functionArn: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.LambdaActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.LambdaActionProperty.Builder)
      .functionArn(functionArn.orNull)
      .build()
}