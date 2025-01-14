package io.burkard.cdk.pipelines

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CodePipelineProps {

  def apply(
    synth: software.amazon.awscdk.pipelines.IFileSetProducer,
    publishAssetsInParallel: Option[Boolean] = None,
    cliVersion: Option[String] = None,
    assetPublishingCodeBuildDefaults: Option[software.amazon.awscdk.pipelines.CodeBuildOptions] = None,
    selfMutation: Option[Boolean] = None,
    crossAccountKeys: Option[Boolean] = None,
    codeBuildDefaults: Option[software.amazon.awscdk.pipelines.CodeBuildOptions] = None,
    dockerCredentials: Option[List[_ <: software.amazon.awscdk.pipelines.DockerCredential]] = None,
    pipelineName: Option[String] = None,
    selfMutationCodeBuildDefaults: Option[software.amazon.awscdk.pipelines.CodeBuildOptions] = None,
    dockerEnabledForSynth: Option[Boolean] = None,
    codePipeline: Option[software.amazon.awscdk.services.codepipeline.Pipeline] = None,
    synthCodeBuildDefaults: Option[software.amazon.awscdk.pipelines.CodeBuildOptions] = None,
    dockerEnabledForSelfMutation: Option[Boolean] = None
  ): software.amazon.awscdk.pipelines.CodePipelineProps =
    (new software.amazon.awscdk.pipelines.CodePipelineProps.Builder)
      .synth(synth)
      .publishAssetsInParallel(publishAssetsInParallel.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cliVersion(cliVersion.orNull)
      .assetPublishingCodeBuildDefaults(assetPublishingCodeBuildDefaults.orNull)
      .selfMutation(selfMutation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .crossAccountKeys(crossAccountKeys.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .codeBuildDefaults(codeBuildDefaults.orNull)
      .dockerCredentials(dockerCredentials.map(_.asJava).orNull)
      .pipelineName(pipelineName.orNull)
      .selfMutationCodeBuildDefaults(selfMutationCodeBuildDefaults.orNull)
      .dockerEnabledForSynth(dockerEnabledForSynth.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .codePipeline(codePipeline.orNull)
      .synthCodeBuildDefaults(synthCodeBuildDefaults.orNull)
      .dockerEnabledForSelfMutation(dockerEnabledForSelfMutation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
