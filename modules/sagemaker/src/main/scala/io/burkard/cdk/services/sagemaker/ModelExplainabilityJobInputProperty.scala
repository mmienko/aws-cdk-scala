package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ModelExplainabilityJobInputProperty {

  def apply(
    endpointInput: software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.EndpointInputProperty
  ): software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty.Builder)
      .endpointInput(endpointInput)
      .build()
}
