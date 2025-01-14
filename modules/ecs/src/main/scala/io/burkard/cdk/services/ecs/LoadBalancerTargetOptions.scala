package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LoadBalancerTargetOptions {

  def apply(
    containerName: String,
    containerPort: Option[Number] = None,
    protocol: Option[software.amazon.awscdk.services.ecs.Protocol] = None
  ): software.amazon.awscdk.services.ecs.LoadBalancerTargetOptions =
    (new software.amazon.awscdk.services.ecs.LoadBalancerTargetOptions.Builder)
      .containerName(containerName)
      .containerPort(containerPort.orNull)
      .protocol(protocol.orNull)
      .build()
}
