package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DynamicPartitioningConfigurationProperty {

  def apply(
    enabled: Option[Boolean] = None,
    retryOptions: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RetryOptionsProperty] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DynamicPartitioningConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DynamicPartitioningConfigurationProperty.Builder)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .retryOptions(retryOptions.orNull)
      .build()
}