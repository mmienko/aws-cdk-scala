package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StringAttributeConstraintsProperty {

  def apply(
    minLength: Option[String] = None,
    maxLength: Option[String] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPool.StringAttributeConstraintsProperty =
    (new software.amazon.awscdk.services.cognito.CfnUserPool.StringAttributeConstraintsProperty.Builder)
      .minLength(minLength.orNull)
      .maxLength(maxLength.orNull)
      .build()
}
