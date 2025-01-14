package io.burkard.cdk.services.ivs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPlaybackKeyPair {

  def apply(
    internalResourceId: String,
    publicKeyMaterial: String,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ivs.CfnPlaybackKeyPair =
    software.amazon.awscdk.services.ivs.CfnPlaybackKeyPair.Builder
      .create(stackCtx, internalResourceId)
      .publicKeyMaterial(publicKeyMaterial)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
