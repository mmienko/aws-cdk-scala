package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ElasticsearchRetryOptionsProperty {

  def apply(
    durationInSeconds: Option[Number] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchRetryOptionsProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchRetryOptionsProperty.Builder)
      .durationInSeconds(durationInSeconds.orNull)
      .build()
}