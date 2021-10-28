package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VirtualNodeTcpConnectionPoolProperty {

  def apply(
    maxConnections: Option[Number] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeTcpConnectionPoolProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeTcpConnectionPoolProperty.Builder)
      .maxConnections(maxConnections.orNull)
      .build()
}