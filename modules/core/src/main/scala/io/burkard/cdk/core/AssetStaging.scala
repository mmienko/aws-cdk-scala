package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AssetStaging {

  def apply(
    internalResourceId: String,
    sourcePath: String,
    assetHashType: Option[software.amazon.awscdk.AssetHashType] = None,
    assetHash: Option[String] = None,
    extraHash: Option[String] = None,
    exclude: Option[List[String]] = None,
    ignoreMode: Option[software.amazon.awscdk.IgnoreMode] = None,
    follow: Option[software.amazon.awscdk.SymlinkFollowMode] = None,
    bundling: Option[software.amazon.awscdk.BundlingOptions] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.AssetStaging =
    software.amazon.awscdk.AssetStaging.Builder
      .create(stackCtx, internalResourceId)
      .sourcePath(sourcePath)
      .assetHashType(assetHashType.orNull)
      .assetHash(assetHash.orNull)
      .extraHash(extraHash.orNull)
      .exclude(exclude.map(_.asJava).orNull)
      .ignoreMode(ignoreMode.orNull)
      .follow(follow.orNull)
      .bundling(bundling.orNull)
      .build()
}
