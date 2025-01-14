package io.burkard.cdk.services.networkmanager

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSite {

  def apply(
    internalResourceId: String,
    globalNetworkId: String,
    location: Option[software.amazon.awscdk.services.networkmanager.CfnSite.LocationProperty] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.networkmanager.CfnSite =
    software.amazon.awscdk.services.networkmanager.CfnSite.Builder
      .create(stackCtx, internalResourceId)
      .globalNetworkId(globalNetworkId)
      .location(location.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
