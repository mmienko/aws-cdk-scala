package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HttpEndpointConfigurationProperty {

  def apply(
    url: String,
    name: Option[String] = None,
    accessKey: Option[String] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointConfigurationProperty.Builder)
      .url(url)
      .name(name.orNull)
      .accessKey(accessKey.orNull)
      .build()
}
