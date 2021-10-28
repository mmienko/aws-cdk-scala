package io.burkard.cdk.services.appmesh

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VirtualGatewayClientPolicyTlsProperty {

  def apply(
    certificate: Option[software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientTlsCertificateProperty] = None,
    ports: Option[List[_ <: Number]] = None,
    enforce: Option[Boolean] = None,
    validation: Option[software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientPolicyTlsProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientPolicyTlsProperty.Builder)
      .certificate(certificate.orNull)
      .ports(ports.map(_.asJava).orNull)
      .enforce(enforce.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .validation(validation.orNull)
      .build()
}