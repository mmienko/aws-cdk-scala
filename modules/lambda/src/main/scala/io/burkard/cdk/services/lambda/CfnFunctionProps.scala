package io.burkard.cdk.services.lambda

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFunctionProps {

  def apply(
    role: String,
    code: software.amazon.awscdk.services.lambda.CfnFunction.CodeProperty,
    deadLetterConfig: Option[software.amazon.awscdk.services.lambda.CfnFunction.DeadLetterConfigProperty] = None,
    layers: Option[List[String]] = None,
    functionName: Option[String] = None,
    tracingConfig: Option[software.amazon.awscdk.services.lambda.CfnFunction.TracingConfigProperty] = None,
    vpcConfig: Option[software.amazon.awscdk.services.lambda.CfnFunction.VpcConfigProperty] = None,
    memorySize: Option[Number] = None,
    fileSystemConfigs: Option[List[_]] = None,
    packageType: Option[String] = None,
    reservedConcurrentExecutions: Option[Number] = None,
    environment: Option[software.amazon.awscdk.services.lambda.CfnFunction.EnvironmentProperty] = None,
    codeSigningConfigArn: Option[String] = None,
    imageConfig: Option[software.amazon.awscdk.services.lambda.CfnFunction.ImageConfigProperty] = None,
    timeout: Option[Number] = None,
    handler: Option[String] = None,
    runtime: Option[String] = None,
    architectures: Option[List[String]] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    kmsKeyArn: Option[String] = None
  ): software.amazon.awscdk.services.lambda.CfnFunctionProps =
    (new software.amazon.awscdk.services.lambda.CfnFunctionProps.Builder)
      .role(role)
      .code(code)
      .deadLetterConfig(deadLetterConfig.orNull)
      .layers(layers.map(_.asJava).orNull)
      .functionName(functionName.orNull)
      .tracingConfig(tracingConfig.orNull)
      .vpcConfig(vpcConfig.orNull)
      .memorySize(memorySize.orNull)
      .fileSystemConfigs(fileSystemConfigs.map(_.asJava).orNull)
      .packageType(packageType.orNull)
      .reservedConcurrentExecutions(reservedConcurrentExecutions.orNull)
      .environment(environment.orNull)
      .codeSigningConfigArn(codeSigningConfigArn.orNull)
      .imageConfig(imageConfig.orNull)
      .timeout(timeout.orNull)
      .handler(handler.orNull)
      .runtime(runtime.orNull)
      .architectures(architectures.map(_.asJava).orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .kmsKeyArn(kmsKeyArn.orNull)
      .build()
}
