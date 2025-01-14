package io.burkard.cdk.services.imagebuilder

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TargetContainerRepositoryProperty {

  def apply(
    repositoryName: Option[String] = None,
    service: Option[String] = None
  ): software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.TargetContainerRepositoryProperty =
    (new software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.TargetContainerRepositoryProperty.Builder)
      .repositoryName(repositoryName.orNull)
      .service(service.orNull)
      .build()
}
