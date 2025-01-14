package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ServiceRegistryProperty {

  def apply(
    containerName: Option[String] = None,
    containerPort: Option[Number] = None,
    port: Option[Number] = None,
    registryArn: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskSet.ServiceRegistryProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskSet.ServiceRegistryProperty.Builder)
      .containerName(containerName.orNull)
      .containerPort(containerPort.orNull)
      .port(port.orNull)
      .registryArn(registryArn.orNull)
      .build()
}
