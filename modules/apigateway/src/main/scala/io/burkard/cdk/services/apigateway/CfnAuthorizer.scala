package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAuthorizer {

  def apply(
    internalResourceId: String,
    `type`: String,
    restApiId: String,
    name: String,
    authorizerResultTtlInSeconds: Option[Number] = None,
    identitySource: Option[String] = None,
    providerArns: Option[List[String]] = None,
    authType: Option[String] = None,
    identityValidationExpression: Option[String] = None,
    authorizerUri: Option[String] = None,
    authorizerCredentials: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CfnAuthorizer =
    software.amazon.awscdk.services.apigateway.CfnAuthorizer.Builder
      .create(stackCtx, internalResourceId)
      .`type`(`type`)
      .restApiId(restApiId)
      .name(name)
      .authorizerResultTtlInSeconds(authorizerResultTtlInSeconds.orNull)
      .identitySource(identitySource.orNull)
      .providerArns(providerArns.map(_.asJava).orNull)
      .authType(authType.orNull)
      .identityValidationExpression(identityValidationExpression.orNull)
      .authorizerUri(authorizerUri.orNull)
      .authorizerCredentials(authorizerCredentials.orNull)
      .build()
}
