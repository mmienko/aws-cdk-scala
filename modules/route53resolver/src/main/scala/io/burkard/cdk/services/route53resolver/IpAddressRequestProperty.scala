package io.burkard.cdk.services.route53resolver

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object IpAddressRequestProperty {

  def apply(
    ip: Option[String] = None,
    subnetId: Option[String] = None
  ): software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint.IpAddressRequestProperty =
    (new software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint.IpAddressRequestProperty.Builder)
      .ip(ip.orNull)
      .subnetId(subnetId.orNull)
      .build()
}