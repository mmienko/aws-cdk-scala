package io.burkard.cdk.services.certificatemanager

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CertificationValidationProps {

  def apply(
    method: Option[software.amazon.awscdk.services.certificatemanager.ValidationMethod] = None,
    hostedZone: Option[software.amazon.awscdk.services.route53.IHostedZone] = None,
    validationDomains: Option[Map[String, String]] = None,
    hostedZones: Option[Map[String, _ <: software.amazon.awscdk.services.route53.IHostedZone]] = None
  ): software.amazon.awscdk.services.certificatemanager.CertificationValidationProps =
    (new software.amazon.awscdk.services.certificatemanager.CertificationValidationProps.Builder)
      .method(method.orNull)
      .hostedZone(hostedZone.orNull)
      .validationDomains(validationDomains.map(_.asJava).orNull)
      .hostedZones(hostedZones.map(_.asJava).orNull)
      .build()
}
