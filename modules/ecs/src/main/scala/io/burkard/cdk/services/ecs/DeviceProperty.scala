package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DeviceProperty {

  def apply(
    hostPath: Option[String] = None,
    permissions: Option[List[String]] = None,
    containerPath: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.DeviceProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.DeviceProperty.Builder)
      .hostPath(hostPath.orNull)
      .permissions(permissions.map(_.asJava).orNull)
      .containerPath(containerPath.orNull)
      .build()
}
