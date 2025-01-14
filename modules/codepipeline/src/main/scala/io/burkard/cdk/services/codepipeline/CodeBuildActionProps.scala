package io.burkard.cdk.services.codepipeline

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CodeBuildActionProps {

  def apply(
    input: software.amazon.awscdk.services.codepipeline.Artifact,
    project: software.amazon.awscdk.services.codebuild.IProject,
    executeBatchBuild: Option[Boolean] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    outputs: Option[List[_ <: software.amazon.awscdk.services.codepipeline.Artifact]] = None,
    variablesNamespace: Option[String] = None,
    runOrder: Option[Number] = None,
    actionName: Option[String] = None,
    `type`: Option[software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionType] = None,
    checkSecretsInPlainTextEnvVariables: Option[Boolean] = None,
    extraInputs: Option[List[_ <: software.amazon.awscdk.services.codepipeline.Artifact]] = None,
    combineBatchBuildArtifacts: Option[Boolean] = None,
    environmentVariables: Option[Map[String, _ <: software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable]] = None
  ): software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionProps =
    (new software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionProps.Builder)
      .input(input)
      .project(project)
      .executeBatchBuild(executeBatchBuild.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .role(role.orNull)
      .outputs(outputs.map(_.asJava).orNull)
      .variablesNamespace(variablesNamespace.orNull)
      .runOrder(runOrder.orNull)
      .actionName(actionName.orNull)
      .`type`(`type`.orNull)
      .checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .extraInputs(extraInputs.map(_.asJava).orNull)
      .combineBatchBuildArtifacts(combineBatchBuildArtifacts.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .environmentVariables(environmentVariables.map(_.asJava).orNull)
      .build()
}
