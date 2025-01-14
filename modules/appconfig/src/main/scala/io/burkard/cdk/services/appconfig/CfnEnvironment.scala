package io.burkard.cdk.services.appconfig

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEnvironment {

  def apply(
    internalResourceId: String,
    name: String,
    applicationId: String,
    monitors: Option[List[_]] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.appconfig.CfnEnvironment.TagsProperty]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appconfig.CfnEnvironment =
    software.amazon.awscdk.services.appconfig.CfnEnvironment.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .applicationId(applicationId)
      .monitors(monitors.map(_.asJava).orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
