package io.burkard.cdk.services.greengrassv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LambdaLinuxProcessParamsProperty {

  def apply(
    isolationMode: Option[String] = None,
    containerParams: Option[software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaContainerParamsProperty] = None
  ): software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaLinuxProcessParamsProperty =
    (new software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaLinuxProcessParamsProperty.Builder)
      .isolationMode(isolationMode.orNull)
      .containerParams(containerParams.orNull)
      .build()
}
