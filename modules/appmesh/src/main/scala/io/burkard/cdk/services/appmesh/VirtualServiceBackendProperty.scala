package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VirtualServiceBackendProperty {

  def apply(
    virtualServiceName: Option[String] = None,
    clientPolicy: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualServiceBackendProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualServiceBackendProperty.Builder)
      .virtualServiceName(virtualServiceName.orNull)
      .clientPolicy(clientPolicy.orNull)
      .build()
}