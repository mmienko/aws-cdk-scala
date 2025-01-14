package io.burkard.cdk.services.acmpca

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PolicyInformationProperty {

  def apply(
    certPolicyId: String,
    policyQualifiers: Option[List[_]] = None
  ): software.amazon.awscdk.services.acmpca.CfnCertificate.PolicyInformationProperty =
    (new software.amazon.awscdk.services.acmpca.CfnCertificate.PolicyInformationProperty.Builder)
      .certPolicyId(certPolicyId)
      .policyQualifiers(policyQualifiers.map(_.asJava).orNull)
      .build()
}
