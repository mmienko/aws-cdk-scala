package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AuthProperty {

  def apply(
    defaultAuthorizer: Option[String] = None,
    authorizers: Option[AnyRef] = None
  ): software.amazon.awscdk.services.sam.CfnApi.AuthProperty =
    (new software.amazon.awscdk.services.sam.CfnApi.AuthProperty.Builder)
      .defaultAuthorizer(defaultAuthorizer.orNull)
      .authorizers(authorizers.orNull)
      .build()
}
