package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SubjectAlternativeNamesProperty {

  def apply(
    `match`: Option[software.amazon.awscdk.services.appmesh.CfnVirtualGateway.SubjectAlternativeNameMatchersProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.SubjectAlternativeNamesProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualGateway.SubjectAlternativeNamesProperty.Builder)
      .`match`(`match`.orNull)
      .build()
}
