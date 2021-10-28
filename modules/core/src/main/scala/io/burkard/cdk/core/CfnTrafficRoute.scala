package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTrafficRoute {

  def apply(
    `type`: Option[String] = None,
    logicalId: Option[String] = None
  ): software.amazon.awscdk.CfnTrafficRoute =
    (new software.amazon.awscdk.CfnTrafficRoute.Builder)
      .`type`(`type`.orNull)
      .logicalId(logicalId.orNull)
      .build()
}