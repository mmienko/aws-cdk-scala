package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DateTimeAttribute {

  def apply(
    mutable: Option[Boolean] = None
  ): software.amazon.awscdk.services.cognito.DateTimeAttribute =
    software.amazon.awscdk.services.cognito.DateTimeAttribute.Builder
      .create()
      .mutable(mutable.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
