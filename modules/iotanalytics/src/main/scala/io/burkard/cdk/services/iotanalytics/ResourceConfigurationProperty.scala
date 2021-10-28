package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ResourceConfigurationProperty {

  def apply(
    volumeSizeInGb: Option[Number] = None,
    computeType: Option[String] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDataset.ResourceConfigurationProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDataset.ResourceConfigurationProperty.Builder)
      .volumeSizeInGb(volumeSizeInGb.orNull)
      .computeType(computeType.orNull)
      .build()
}