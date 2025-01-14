package io.burkard.cdk.services.lambda

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AssetImageCode {

  def apply(
    directory: String,
    buildArgs: Option[Map[String, String]] = None,
    invalidation: Option[software.amazon.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions] = None,
    cmd: Option[List[String]] = None,
    entrypoint: Option[List[String]] = None,
    followSymlinks: Option[software.amazon.awscdk.SymlinkFollowMode] = None,
    ignoreMode: Option[software.amazon.awscdk.IgnoreMode] = None,
    extraHash: Option[String] = None,
    workingDirectory: Option[String] = None,
    file: Option[String] = None,
    target: Option[String] = None,
    exclude: Option[List[String]] = None
  ): software.amazon.awscdk.services.lambda.AssetImageCode =
    software.amazon.awscdk.services.lambda.AssetImageCode.Builder
      .create(directory)
      .buildArgs(buildArgs.map(_.asJava).orNull)
      .invalidation(invalidation.orNull)
      .cmd(cmd.map(_.asJava).orNull)
      .entrypoint(entrypoint.map(_.asJava).orNull)
      .followSymlinks(followSymlinks.orNull)
      .ignoreMode(ignoreMode.orNull)
      .extraHash(extraHash.orNull)
      .workingDirectory(workingDirectory.orNull)
      .file(file.orNull)
      .target(target.orNull)
      .exclude(exclude.map(_.asJava).orNull)
      .build()
}
