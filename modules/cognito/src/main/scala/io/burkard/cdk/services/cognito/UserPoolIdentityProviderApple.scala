package io.burkard.cdk.services.cognito

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object UserPoolIdentityProviderApple {

  def apply(
    internalResourceId: String,
    clientId: Option[String] = None,
    teamId: Option[String] = None,
    attributeMapping: Option[software.amazon.awscdk.services.cognito.AttributeMapping] = None,
    scopes: Option[List[String]] = None,
    keyId: Option[String] = None,
    privateKey: Option[String] = None,
    userPool: Option[software.amazon.awscdk.services.cognito.IUserPool] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cognito.UserPoolIdentityProviderApple =
    software.amazon.awscdk.services.cognito.UserPoolIdentityProviderApple.Builder
      .create(stackCtx, internalResourceId)
      .clientId(clientId.orNull)
      .teamId(teamId.orNull)
      .attributeMapping(attributeMapping.orNull)
      .scopes(scopes.map(_.asJava).orNull)
      .keyId(keyId.orNull)
      .privateKey(privateKey.orNull)
      .userPool(userPool.orNull)
      .build()
}