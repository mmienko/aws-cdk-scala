package io.burkard.cdk.services.databrew

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRecipeProps {

  def apply(
    name: String,
    steps: List[_],
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.databrew.CfnRecipeProps =
    (new software.amazon.awscdk.services.databrew.CfnRecipeProps.Builder)
      .name(name)
      .steps(steps.asJava)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
