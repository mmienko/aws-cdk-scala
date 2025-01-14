package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualServiceSpecProperty {

  def apply(
    provider: Option[software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualServiceProviderProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualServiceSpecProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualServiceSpecProperty.Builder)
      .provider(provider.orNull)
      .build()
}
