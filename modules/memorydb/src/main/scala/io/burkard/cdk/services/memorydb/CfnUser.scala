package io.burkard.cdk.services.memorydb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUser {

  def apply(
    internalResourceId: String,
    accessString: String,
    authenticationMode: AnyRef,
    userName: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.memorydb.CfnUser =
    software.amazon.awscdk.services.memorydb.CfnUser.Builder
      .create(stackCtx, internalResourceId)
      .accessString(accessString)
      .authenticationMode(authenticationMode)
      .userName(userName)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
