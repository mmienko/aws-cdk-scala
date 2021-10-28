package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LocationConfigurationProperty {

  def apply(
    locationCapacity: Option[software.amazon.awscdk.services.gamelift.CfnFleet.LocationCapacityProperty] = None,
    location: Option[String] = None
  ): software.amazon.awscdk.services.gamelift.CfnFleet.LocationConfigurationProperty =
    (new software.amazon.awscdk.services.gamelift.CfnFleet.LocationConfigurationProperty.Builder)
      .locationCapacity(locationCapacity.orNull)
      .location(location.orNull)
      .build()
}