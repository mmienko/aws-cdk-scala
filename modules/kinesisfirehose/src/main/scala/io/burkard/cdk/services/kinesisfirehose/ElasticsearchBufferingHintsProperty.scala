package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ElasticsearchBufferingHintsProperty {

  def apply(
    sizeInMBs: Option[Number] = None,
    intervalInSeconds: Option[Number] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchBufferingHintsProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchBufferingHintsProperty.Builder)
      .sizeInMBs(sizeInMBs.orNull)
      .intervalInSeconds(intervalInSeconds.orNull)
      .build()
}
