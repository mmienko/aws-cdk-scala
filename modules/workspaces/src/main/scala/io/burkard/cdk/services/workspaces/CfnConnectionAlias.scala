package io.burkard.cdk.services.workspaces

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnConnectionAlias {

  def apply(
    internalResourceId: String,
    connectionString: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.workspaces.CfnConnectionAlias =
    software.amazon.awscdk.services.workspaces.CfnConnectionAlias.Builder
      .create(stackCtx, internalResourceId)
      .connectionString(connectionString)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
