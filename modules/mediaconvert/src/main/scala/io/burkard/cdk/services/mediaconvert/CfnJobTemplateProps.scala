package io.burkard.cdk.services.mediaconvert

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnJobTemplateProps {

  def apply(
    settingsJson: AnyRef,
    queue: Option[String] = None,
    statusUpdateInterval: Option[String] = None,
    category: Option[String] = None,
    accelerationSettings: Option[software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.AccelerationSettingsProperty] = None,
    hopDestinations: Option[List[_]] = None,
    name: Option[String] = None,
    priority: Option[Number] = None,
    description: Option[String] = None,
    tags: Option[AnyRef] = None
  ): software.amazon.awscdk.services.mediaconvert.CfnJobTemplateProps =
    (new software.amazon.awscdk.services.mediaconvert.CfnJobTemplateProps.Builder)
      .settingsJson(settingsJson)
      .queue(queue.orNull)
      .statusUpdateInterval(statusUpdateInterval.orNull)
      .category(category.orNull)
      .accelerationSettings(accelerationSettings.orNull)
      .hopDestinations(hopDestinations.map(_.asJava).orNull)
      .name(name.orNull)
      .priority(priority.orNull)
      .description(description.orNull)
      .tags(tags.orNull)
      .build()
}
