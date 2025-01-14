package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEndpointConfig {

  def apply(
    internalResourceId: String,
    productionVariants: List[_],
    dataCaptureConfig: Option[software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.DataCaptureConfigProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    asyncInferenceConfig: Option[software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceConfigProperty] = None,
    endpointConfigName: Option[String] = None,
    kmsKeyId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sagemaker.CfnEndpointConfig =
    software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.Builder
      .create(stackCtx, internalResourceId)
      .productionVariants(productionVariants.asJava)
      .dataCaptureConfig(dataCaptureConfig.orNull)
      .tags(tags.map(_.asJava).orNull)
      .asyncInferenceConfig(asyncInferenceConfig.orNull)
      .endpointConfigName(endpointConfigName.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .build()
}
