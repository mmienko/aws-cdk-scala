package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SourceConfig {

  def apply(
    sourceProperty: software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty,
    buildTriggers: Option[software.amazon.awscdk.services.codebuild.CfnProject.ProjectTriggersProperty] = None,
    sourceVersion: Option[String] = None
  ): software.amazon.awscdk.services.codebuild.SourceConfig =
    (new software.amazon.awscdk.services.codebuild.SourceConfig.Builder)
      .sourceProperty(sourceProperty)
      .buildTriggers(buildTriggers.orNull)
      .sourceVersion(sourceVersion.orNull)
      .build()
}
