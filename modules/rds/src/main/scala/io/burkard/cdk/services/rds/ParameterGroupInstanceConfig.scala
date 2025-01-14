package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ParameterGroupInstanceConfig {

  def apply(
    parameterGroupName: String
  ): software.amazon.awscdk.services.rds.ParameterGroupInstanceConfig =
    (new software.amazon.awscdk.services.rds.ParameterGroupInstanceConfig.Builder)
      .parameterGroupName(parameterGroupName)
      .build()
}
