package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OnFailureProperty {

  def apply(
    destination: Option[String] = None
  ): software.amazon.awscdk.services.lambda.CfnEventSourceMapping.OnFailureProperty =
    (new software.amazon.awscdk.services.lambda.CfnEventSourceMapping.OnFailureProperty.Builder)
      .destination(destination.orNull)
      .build()
}
