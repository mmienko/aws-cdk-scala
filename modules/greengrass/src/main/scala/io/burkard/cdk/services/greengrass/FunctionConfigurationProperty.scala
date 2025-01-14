package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FunctionConfigurationProperty {

  def apply(
    execArgs: Option[String] = None,
    memorySize: Option[Number] = None,
    environment: Option[software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.EnvironmentProperty] = None,
    pinned: Option[Boolean] = None,
    encodingType: Option[String] = None,
    timeout: Option[Number] = None,
    executable: Option[String] = None
  ): software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionConfigurationProperty =
    (new software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionConfigurationProperty.Builder)
      .execArgs(execArgs.orNull)
      .memorySize(memorySize.orNull)
      .environment(environment.orNull)
      .pinned(pinned.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .encodingType(encodingType.orNull)
      .timeout(timeout.orNull)
      .executable(executable.orNull)
      .build()
}
