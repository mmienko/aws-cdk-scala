package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LocationProperty {

  def apply(
    country: Option[software.amazon.awscdk.services.pinpoint.CfnSegment.SetDimensionProperty] = None,
    gpsPoint: Option[software.amazon.awscdk.services.pinpoint.CfnSegment.GPSPointProperty] = None
  ): software.amazon.awscdk.services.pinpoint.CfnSegment.LocationProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnSegment.LocationProperty.Builder)
      .country(country.orNull)
      .gpsPoint(gpsPoint.orNull)
      .build()
}
