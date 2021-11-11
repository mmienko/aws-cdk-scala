package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAuthorizerV2 {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    authorizerType: Option[String] = None,
    authorizerResultTtlInSeconds: Option[Number] = None,
    identitySource: Option[List[String]] = None,
    identityValidationExpression: Option[String] = None,
    apiId: Option[String] = None,
    authorizerCredentialsArn: Option[String] = None,
    jwtConfiguration: Option[software.amazon.awscdk.services.apigateway.CfnAuthorizerV2.JWTConfigurationProperty] = None,
    authorizerUri: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CfnAuthorizerV2 =
    software.amazon.awscdk.services.apigateway.CfnAuthorizerV2.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .authorizerType(authorizerType.orNull)
      .authorizerResultTtlInSeconds(authorizerResultTtlInSeconds.orNull)
      .identitySource(identitySource.map(_.asJava).orNull)
      .identityValidationExpression(identityValidationExpression.orNull)
      .apiId(apiId.orNull)
      .authorizerCredentialsArn(authorizerCredentialsArn.orNull)
      .jwtConfiguration(jwtConfiguration.orNull)
      .authorizerUri(authorizerUri.orNull)
      .build()
}
