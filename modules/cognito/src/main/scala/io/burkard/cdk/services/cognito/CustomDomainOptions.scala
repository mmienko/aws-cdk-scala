package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CustomDomainOptions {

  def apply(
    certificate: Option[software.amazon.awscdk.services.certificatemanager.ICertificate] = None,
    domainName: Option[String] = None
  ): software.amazon.awscdk.services.cognito.CustomDomainOptions =
    (new software.amazon.awscdk.services.cognito.CustomDomainOptions.Builder)
      .certificate(certificate.orNull)
      .domainName(domainName.orNull)
      .build()
}