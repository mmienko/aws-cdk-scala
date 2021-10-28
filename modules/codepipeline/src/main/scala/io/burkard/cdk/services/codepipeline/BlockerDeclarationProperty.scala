package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BlockerDeclarationProperty {

  def apply(
    name: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.CfnPipeline.BlockerDeclarationProperty =
    (new software.amazon.awscdk.services.codepipeline.CfnPipeline.BlockerDeclarationProperty.Builder)
      .name(name.orNull)
      .`type`(`type`.orNull)
      .build()
}