package io.burkard.cdk.services.datapipeline

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPipelineProps {

  def apply(
    name: String,
    parameterObjects: List[_],
    description: Option[String] = None,
    parameterValues: Option[List[_]] = None,
    pipelineTags: Option[List[_]] = None,
    pipelineObjects: Option[List[_]] = None,
    activate: Option[Boolean] = None
  ): software.amazon.awscdk.services.datapipeline.CfnPipelineProps =
    (new software.amazon.awscdk.services.datapipeline.CfnPipelineProps.Builder)
      .name(name)
      .parameterObjects(parameterObjects.asJava)
      .description(description.orNull)
      .parameterValues(parameterValues.map(_.asJava).orNull)
      .pipelineTags(pipelineTags.map(_.asJava).orNull)
      .pipelineObjects(pipelineObjects.map(_.asJava).orNull)
      .activate(activate.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
