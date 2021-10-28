package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDNSSEC {

  def apply(
    internalResourceId: String,
    hostedZoneId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53.CfnDNSSEC =
    software.amazon.awscdk.services.route53.CfnDNSSEC.Builder
      .create(stackCtx, internalResourceId)
      .hostedZoneId(hostedZoneId.orNull)
      .build()
}