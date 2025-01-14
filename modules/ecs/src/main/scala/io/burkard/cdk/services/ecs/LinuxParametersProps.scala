package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LinuxParametersProps {

  def apply(
    initProcessEnabled: Option[Boolean] = None,
    sharedMemorySize: Option[Number] = None
  ): software.amazon.awscdk.services.ecs.LinuxParametersProps =
    (new software.amazon.awscdk.services.ecs.LinuxParametersProps.Builder)
      .initProcessEnabled(initProcessEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .sharedMemorySize(sharedMemorySize.orNull)
      .build()
}
