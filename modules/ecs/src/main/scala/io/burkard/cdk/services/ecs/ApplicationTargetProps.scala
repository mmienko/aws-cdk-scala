package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApplicationTargetProps {

  def apply(
    containerPort: Number,
    priority: Option[Number] = None,
    listener: Option[String] = None,
    pathPattern: Option[String] = None,
    protocol: Option[software.amazon.awscdk.services.ecs.Protocol] = None,
    hostHeader: Option[String] = None
  ): software.amazon.awscdk.services.ecs.patterns.ApplicationTargetProps =
    (new software.amazon.awscdk.services.ecs.patterns.ApplicationTargetProps.Builder)
      .containerPort(containerPort)
      .priority(priority.orNull)
      .listener(listener.orNull)
      .pathPattern(pathPattern.orNull)
      .protocol(protocol.orNull)
      .hostHeader(hostHeader.orNull)
      .build()
}
