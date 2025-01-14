package io.burkard.cdk.services.fis

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ExperimentTemplateTargetProperty {

  def apply(
    resourceType: String,
    selectionMode: String,
    resourceTags: Option[Map[String, String]] = None,
    filters: Option[List[_]] = None,
    resourceArns: Option[List[String]] = None
  ): software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateTargetProperty =
    (new software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateTargetProperty.Builder)
      .resourceType(resourceType)
      .selectionMode(selectionMode)
      .resourceTags(resourceTags.map(_.asJava).orNull)
      .filters(filters.map(_.asJava).orNull)
      .resourceArns(resourceArns.map(_.asJava).orNull)
      .build()
}
