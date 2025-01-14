package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMesh {

  def apply(
    internalResourceId: String,
    meshName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    spec: Option[software.amazon.awscdk.services.appmesh.CfnMesh.MeshSpecProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appmesh.CfnMesh =
    software.amazon.awscdk.services.appmesh.CfnMesh.Builder
      .create(stackCtx, internalResourceId)
      .meshName(meshName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .spec(spec.orNull)
      .build()
}
