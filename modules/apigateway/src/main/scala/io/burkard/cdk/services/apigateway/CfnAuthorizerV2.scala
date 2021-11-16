package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAuthorizerV2 {

  def apply(
    internalResourceId: String,
    name: String,
    authorizerType: String,
    identitySource: List[String],
    apiId: String,
    authorizerResultTtlInSeconds: Option[Number] = None,
    identityValidationExpression: Option[String] = None,
    authorizerCredentialsArn: Option[String] = None,
    jwtConfiguration: Option[software.amazon.awscdk.services.apigateway.CfnAuthorizerV2.JWTConfigurationProperty] = None,
    authorizerUri: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CfnAuthorizerV2 =
    software.amazon.awscdk.services.apigateway.CfnAuthorizerV2.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .authorizerType(authorizerType)
      .identitySource(identitySource.asJava)
      .apiId(apiId)
      .authorizerResultTtlInSeconds(authorizerResultTtlInSeconds.orNull)
      .identityValidationExpression(identityValidationExpression.orNull)
      .authorizerCredentialsArn(authorizerCredentialsArn.orNull)
      .jwtConfiguration(jwtConfiguration.orNull)
      .authorizerUri(authorizerUri.orNull)
      .build()
}
