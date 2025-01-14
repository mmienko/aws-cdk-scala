package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TracingConfigProperty {

  def apply(
    mode: Option[String] = None
  ): software.amazon.awscdk.services.lambda.CfnFunction.TracingConfigProperty =
    (new software.amazon.awscdk.services.lambda.CfnFunction.TracingConfigProperty.Builder)
      .mode(mode.orNull)
      .build()
}
