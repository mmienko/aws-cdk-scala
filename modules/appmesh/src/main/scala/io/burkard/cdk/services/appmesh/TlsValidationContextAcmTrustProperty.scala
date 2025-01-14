package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TlsValidationContextAcmTrustProperty {

  def apply(
    certificateAuthorityArns: List[String]
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextAcmTrustProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextAcmTrustProperty.Builder)
      .certificateAuthorityArns(certificateAuthorityArns.asJava)
      .build()
}
