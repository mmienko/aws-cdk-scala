package io.burkard.cdk.services.appconfig

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEnvironmentProps {

  def apply(
    name: String,
    applicationId: String,
    monitors: Option[List[_]] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.appconfig.CfnEnvironment.TagsProperty]] = None
  ): software.amazon.awscdk.services.appconfig.CfnEnvironmentProps =
    (new software.amazon.awscdk.services.appconfig.CfnEnvironmentProps.Builder)
      .name(name)
      .applicationId(applicationId)
      .monitors(monitors.map(_.asJava).orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
