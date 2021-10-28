package io.burkard.cdk.services.lightsail

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LocationProperty {

  def apply(
    availabilityZone: Option[String] = None,
    regionName: Option[String] = None
  ): software.amazon.awscdk.services.lightsail.CfnInstance.LocationProperty =
    (new software.amazon.awscdk.services.lightsail.CfnInstance.LocationProperty.Builder)
      .availabilityZone(availabilityZone.orNull)
      .regionName(regionName.orNull)
      .build()
}