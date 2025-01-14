package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ClientTlsCertificateProperty {

  def apply(
    sds: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsSdsCertificateProperty] = None,
    file: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsFileCertificateProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientTlsCertificateProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientTlsCertificateProperty.Builder)
      .sds(sds.orNull)
      .file(file.orNull)
      .build()
}
