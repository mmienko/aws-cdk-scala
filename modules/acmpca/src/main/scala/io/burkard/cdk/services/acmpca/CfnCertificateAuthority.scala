package io.burkard.cdk.services.acmpca

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCertificateAuthority {

  def apply(
    internalResourceId: String,
    subject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.SubjectProperty,
    keyAlgorithm: String,
    signingAlgorithm: String,
    `type`: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    keyStorageSecurityStandard: Option[String] = None,
    revocationConfiguration: Option[software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.RevocationConfigurationProperty] = None,
    csrExtensions: Option[software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CsrExtensionsProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.acmpca.CfnCertificateAuthority =
    software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.Builder
      .create(stackCtx, internalResourceId)
      .subject(subject)
      .keyAlgorithm(keyAlgorithm)
      .signingAlgorithm(signingAlgorithm)
      .`type`(`type`)
      .tags(tags.map(_.asJava).orNull)
      .keyStorageSecurityStandard(keyStorageSecurityStandard.orNull)
      .revocationConfiguration(revocationConfiguration.orNull)
      .csrExtensions(csrExtensions.orNull)
      .build()
}
