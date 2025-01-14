package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ContainerImageConfig {

  def apply(
    imageName: String,
    repositoryCredentials: Option[software.amazon.awscdk.services.ecs.CfnTaskDefinition.RepositoryCredentialsProperty] = None
  ): software.amazon.awscdk.services.ecs.ContainerImageConfig =
    (new software.amazon.awscdk.services.ecs.ContainerImageConfig.Builder)
      .imageName(imageName)
      .repositoryCredentials(repositoryCredentials.orNull)
      .build()
}
