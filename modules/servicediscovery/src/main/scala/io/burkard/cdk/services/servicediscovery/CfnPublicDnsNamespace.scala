package io.burkard.cdk.services.servicediscovery

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPublicDnsNamespace {

  def apply(
    internalResourceId: String,
    name: String,
    properties: Option[software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.PropertiesProperty] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace =
    software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .properties(properties.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
