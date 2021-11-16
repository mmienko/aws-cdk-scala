package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnModelExplainabilityJobDefinition {

  def apply(
    internalResourceId: String,
    modelExplainabilityJobInput: software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty,
    jobResources: software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.MonitoringResourcesProperty,
    roleArn: String,
    modelExplainabilityJobOutputConfig: software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.MonitoringOutputConfigProperty,
    modelExplainabilityAppSpecification: software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ModelExplainabilityAppSpecificationProperty,
    networkConfig: Option[software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.NetworkConfigProperty] = None,
    modelExplainabilityBaselineConfig: Option[software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ModelExplainabilityBaselineConfigProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    stoppingCondition: Option[software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.StoppingConditionProperty] = None,
    jobDefinitionName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition =
    software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.Builder
      .create(stackCtx, internalResourceId)
      .modelExplainabilityJobInput(modelExplainabilityJobInput)
      .jobResources(jobResources)
      .roleArn(roleArn)
      .modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig)
      .modelExplainabilityAppSpecification(modelExplainabilityAppSpecification)
      .networkConfig(networkConfig.orNull)
      .modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig.orNull)
      .tags(tags.map(_.asJava).orNull)
      .stoppingCondition(stoppingCondition.orNull)
      .jobDefinitionName(jobDefinitionName.orNull)
      .build()
}
