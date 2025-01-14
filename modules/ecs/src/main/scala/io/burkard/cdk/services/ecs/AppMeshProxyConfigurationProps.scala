package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AppMeshProxyConfigurationProps {

  def apply(
    proxyEgressPort: Number,
    appPorts: List[_ <: Number],
    proxyIngressPort: Number,
    egressIgnoredIPs: Option[List[String]] = None,
    ignoredUid: Option[Number] = None,
    ignoredGid: Option[Number] = None,
    egressIgnoredPorts: Option[List[_ <: Number]] = None
  ): software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationProps =
    (new software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationProps.Builder)
      .proxyEgressPort(proxyEgressPort)
      .appPorts(appPorts.asJava)
      .proxyIngressPort(proxyIngressPort)
      .egressIgnoredIPs(egressIgnoredIPs.map(_.asJava).orNull)
      .ignoredUid(ignoredUid.orNull)
      .ignoredGid(ignoredGid.orNull)
      .egressIgnoredPorts(egressIgnoredPorts.map(_.asJava).orNull)
      .build()
}
