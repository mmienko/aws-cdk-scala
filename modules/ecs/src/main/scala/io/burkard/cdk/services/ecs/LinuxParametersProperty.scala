package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LinuxParametersProperty {

  def apply(
    capabilities: Option[software.amazon.awscdk.services.ecs.CfnTaskDefinition.KernelCapabilitiesProperty] = None,
    initProcessEnabled: Option[Boolean] = None,
    sharedMemorySize: Option[Number] = None,
    swappiness: Option[Number] = None,
    maxSwap: Option[Number] = None,
    devices: Option[List[_]] = None,
    tmpfs: Option[List[_]] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty.Builder)
      .capabilities(capabilities.orNull)
      .initProcessEnabled(initProcessEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .sharedMemorySize(sharedMemorySize.orNull)
      .swappiness(swappiness.orNull)
      .maxSwap(maxSwap.orNull)
      .devices(devices.map(_.asJava).orNull)
      .tmpfs(tmpfs.map(_.asJava).orNull)
      .build()
}
