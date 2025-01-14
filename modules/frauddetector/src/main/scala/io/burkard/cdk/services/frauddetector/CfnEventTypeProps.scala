package io.burkard.cdk.services.frauddetector

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEventTypeProps {

  def apply(
    eventVariables: List[_],
    name: String,
    labels: List[_],
    entityTypes: List[_],
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.frauddetector.CfnEventTypeProps =
    (new software.amazon.awscdk.services.frauddetector.CfnEventTypeProps.Builder)
      .eventVariables(eventVariables.asJava)
      .name(name)
      .labels(labels.asJava)
      .entityTypes(entityTypes.asJava)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
