package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HostedZoneAttributes {

  def apply(
    hostedZoneId: Option[String] = None,
    zoneName: Option[String] = None
  ): software.amazon.awscdk.services.route53.HostedZoneAttributes =
    (new software.amazon.awscdk.services.route53.HostedZoneAttributes.Builder)
      .hostedZoneId(hostedZoneId.orNull)
      .zoneName(zoneName.orNull)
      .build()
}