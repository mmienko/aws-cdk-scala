package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFunctionProps {

  def apply(
    name: String,
    functionCode: Option[String] = None,
    autoPublish: Option[Boolean] = None,
    functionConfig: Option[software.amazon.awscdk.services.cloudfront.CfnFunction.FunctionConfigProperty] = None
  ): software.amazon.awscdk.services.cloudfront.CfnFunctionProps =
    (new software.amazon.awscdk.services.cloudfront.CfnFunctionProps.Builder)
      .name(name)
      .functionCode(functionCode.orNull)
      .autoPublish(autoPublish.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .functionConfig(functionConfig.orNull)
      .build()
}
