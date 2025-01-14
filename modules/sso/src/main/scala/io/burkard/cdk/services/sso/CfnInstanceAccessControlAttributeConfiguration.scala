package io.burkard.cdk.services.sso

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnInstanceAccessControlAttributeConfiguration {

  def apply(
    internalResourceId: String,
    instanceArn: String,
    accessControlAttributes: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration =
    software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.Builder
      .create(stackCtx, internalResourceId)
      .instanceArn(instanceArn)
      .accessControlAttributes(accessControlAttributes.map(_.asJava).orNull)
      .build()
}
