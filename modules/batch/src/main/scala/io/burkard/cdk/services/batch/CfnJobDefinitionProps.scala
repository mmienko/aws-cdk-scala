package io.burkard.cdk.services.batch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnJobDefinitionProps {

  def apply(
    retryStrategy: Option[software.amazon.awscdk.services.batch.CfnJobDefinition.RetryStrategyProperty] = None,
    schedulingPriority: Option[Number] = None,
    containerProperties: Option[software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty] = None,
    tags: Option[AnyRef] = None,
    platformCapabilities: Option[List[String]] = None,
    nodeProperties: Option[software.amazon.awscdk.services.batch.CfnJobDefinition.NodePropertiesProperty] = None,
    propagateTags: Option[Boolean] = None,
    `type`: Option[String] = None,
    timeout: Option[software.amazon.awscdk.services.batch.CfnJobDefinition.TimeoutProperty] = None,
    parameters: Option[AnyRef] = None,
    jobDefinitionName: Option[String] = None
  ): software.amazon.awscdk.services.batch.CfnJobDefinitionProps =
    (new software.amazon.awscdk.services.batch.CfnJobDefinitionProps.Builder)
      .retryStrategy(retryStrategy.orNull)
      .schedulingPriority(schedulingPriority.orNull)
      .containerProperties(containerProperties.orNull)
      .tags(tags.orNull)
      .platformCapabilities(platformCapabilities.map(_.asJava).orNull)
      .nodeProperties(nodeProperties.orNull)
      .propagateTags(propagateTags.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .`type`(`type`.orNull)
      .timeout(timeout.orNull)
      .parameters(parameters.orNull)
      .jobDefinitionName(jobDefinitionName.orNull)
      .build()
}
