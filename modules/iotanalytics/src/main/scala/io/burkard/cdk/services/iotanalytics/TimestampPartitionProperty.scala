package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TimestampPartitionProperty {

  def apply(
    attributeName: Option[String] = None,
    timestampFormat: Option[String] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDatastore.TimestampPartitionProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDatastore.TimestampPartitionProperty.Builder)
      .attributeName(attributeName.orNull)
      .timestampFormat(timestampFormat.orNull)
      .build()
}