package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DeadLetterQueueProperty {

  def apply(
    targetArn: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.DeadLetterQueueProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.DeadLetterQueueProperty.Builder)
      .targetArn(targetArn.orNull)
      .`type`(`type`.orNull)
      .build()
}