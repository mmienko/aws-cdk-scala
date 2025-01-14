package io.burkard.cdk.services.memorydb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnParameterGroupProps {

  def apply(
    parameterGroupName: String,
    family: String,
    parameters: Option[AnyRef] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.memorydb.CfnParameterGroupProps =
    (new software.amazon.awscdk.services.memorydb.CfnParameterGroupProps.Builder)
      .parameterGroupName(parameterGroupName)
      .family(family)
      .parameters(parameters.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
