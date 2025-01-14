package io.burkard.cdk.services.imagebuilder

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ComponentParameterProperty {

  def apply(
    name: String,
    value: List[String]
  ): software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.ComponentParameterProperty =
    (new software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.ComponentParameterProperty.Builder)
      .name(name)
      .value(value.asJava)
      .build()
}
