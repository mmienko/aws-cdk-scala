package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ContainerDependencyProperty {

  def apply(
    containerName: Option[String] = None,
    condition: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDependencyProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDependencyProperty.Builder)
      .containerName(containerName.orNull)
      .condition(condition.orNull)
      .build()
}
