package io.burkard.cdk.services.ssmincidents

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ReplicationRegionProperty {

  def apply(
    regionConfiguration: Option[software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.RegionConfigurationProperty] = None,
    regionName: Option[String] = None
  ): software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.ReplicationRegionProperty =
    (new software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.ReplicationRegionProperty.Builder)
      .regionConfiguration(regionConfiguration.orNull)
      .regionName(regionName.orNull)
      .build()
}