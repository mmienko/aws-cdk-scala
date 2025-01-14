package io.burkard.cdk.services.ivs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStreamKey {

  def apply(
    internalResourceId: String,
    channelArn: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ivs.CfnStreamKey =
    software.amazon.awscdk.services.ivs.CfnStreamKey.Builder
      .create(stackCtx, internalResourceId)
      .channelArn(channelArn)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
