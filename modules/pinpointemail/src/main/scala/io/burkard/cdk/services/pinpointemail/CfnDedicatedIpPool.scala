package io.burkard.cdk.services.pinpointemail

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDedicatedIpPool {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPool.TagsProperty]] = None,
    poolName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPool =
    software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPool.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .poolName(poolName.orNull)
      .build()
}
