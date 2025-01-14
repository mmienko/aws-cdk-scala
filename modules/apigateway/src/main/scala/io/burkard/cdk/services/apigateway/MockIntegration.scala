package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MockIntegration {

  def apply(
    integrationResponses: Option[List[_ <: software.amazon.awscdk.services.apigateway.IntegrationResponse]] = None,
    cacheKeyParameters: Option[List[String]] = None,
    requestTemplates: Option[Map[String, String]] = None,
    contentHandling: Option[software.amazon.awscdk.services.apigateway.ContentHandling] = None,
    passthroughBehavior: Option[software.amazon.awscdk.services.apigateway.PassthroughBehavior] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    connectionType: Option[software.amazon.awscdk.services.apigateway.ConnectionType] = None,
    requestParameters: Option[Map[String, String]] = None,
    credentialsPassthrough: Option[Boolean] = None,
    cacheNamespace: Option[String] = None,
    credentialsRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    vpcLink: Option[software.amazon.awscdk.services.apigateway.IVpcLink] = None
  ): software.amazon.awscdk.services.apigateway.MockIntegration =
    software.amazon.awscdk.services.apigateway.MockIntegration.Builder
      .create()
      .integrationResponses(integrationResponses.map(_.asJava).orNull)
      .cacheKeyParameters(cacheKeyParameters.map(_.asJava).orNull)
      .requestTemplates(requestTemplates.map(_.asJava).orNull)
      .contentHandling(contentHandling.orNull)
      .passthroughBehavior(passthroughBehavior.orNull)
      .timeout(timeout.orNull)
      .connectionType(connectionType.orNull)
      .requestParameters(requestParameters.map(_.asJava).orNull)
      .credentialsPassthrough(credentialsPassthrough.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cacheNamespace(cacheNamespace.orNull)
      .credentialsRole(credentialsRole.orNull)
      .vpcLink(vpcLink.orNull)
      .build()
}
