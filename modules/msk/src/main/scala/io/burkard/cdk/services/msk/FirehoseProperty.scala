package io.burkard.cdk.services.msk

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FirehoseProperty {

  def apply(
    deliveryStream: Option[String] = None,
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.msk.CfnCluster.FirehoseProperty =
    (new software.amazon.awscdk.services.msk.CfnCluster.FirehoseProperty.Builder)
      .deliveryStream(deliveryStream.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}