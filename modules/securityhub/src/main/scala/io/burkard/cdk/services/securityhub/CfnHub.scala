package io.burkard.cdk.services.securityhub

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnHub {

  def apply(
    internalResourceId: String,
    tags: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.securityhub.CfnHub =
    software.amazon.awscdk.services.securityhub.CfnHub.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.orNull)
      .build()
}
