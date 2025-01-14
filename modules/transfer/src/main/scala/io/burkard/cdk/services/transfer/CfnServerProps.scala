package io.burkard.cdk.services.transfer

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnServerProps {

  def apply(
    loggingRole: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    domain: Option[String] = None,
    workflowDetails: Option[software.amazon.awscdk.services.transfer.CfnServer.WorkflowDetailsProperty] = None,
    endpointDetails: Option[software.amazon.awscdk.services.transfer.CfnServer.EndpointDetailsProperty] = None,
    securityPolicyName: Option[String] = None,
    identityProviderDetails: Option[software.amazon.awscdk.services.transfer.CfnServer.IdentityProviderDetailsProperty] = None,
    endpointType: Option[String] = None,
    protocolDetails: Option[software.amazon.awscdk.services.transfer.CfnServer.ProtocolDetailsProperty] = None,
    identityProviderType: Option[String] = None,
    protocols: Option[List[String]] = None,
    certificate: Option[String] = None
  ): software.amazon.awscdk.services.transfer.CfnServerProps =
    (new software.amazon.awscdk.services.transfer.CfnServerProps.Builder)
      .loggingRole(loggingRole.orNull)
      .tags(tags.map(_.asJava).orNull)
      .domain(domain.orNull)
      .workflowDetails(workflowDetails.orNull)
      .endpointDetails(endpointDetails.orNull)
      .securityPolicyName(securityPolicyName.orNull)
      .identityProviderDetails(identityProviderDetails.orNull)
      .endpointType(endpointType.orNull)
      .protocolDetails(protocolDetails.orNull)
      .identityProviderType(identityProviderType.orNull)
      .protocols(protocols.map(_.asJava).orNull)
      .certificate(certificate.orNull)
      .build()
}
