package io.burkard.cdk.services.cognito

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UserPoolIdentityProviderGoogle {

  def apply(
    internalResourceId: String,
    clientId: String,
    clientSecret: String,
    attributeMapping: Option[software.amazon.awscdk.services.cognito.AttributeMapping] = None,
    scopes: Option[List[String]] = None,
    userPool: Option[software.amazon.awscdk.services.cognito.IUserPool] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogle =
    software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogle.Builder
      .create(stackCtx, internalResourceId)
      .clientId(clientId)
      .clientSecret(clientSecret)
      .attributeMapping(attributeMapping.orNull)
      .scopes(scopes.map(_.asJava).orNull)
      .userPool(userPool.orNull)
      .build()
}
