package io.burkard.cdk.services.lambda

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AssetCode {

  def apply(
    path: String,
    assetHash: Option[String] = None,
    bundling: Option[software.amazon.awscdk.BundlingOptions] = None,
    followSymlinks: Option[software.amazon.awscdk.SymlinkFollowMode] = None,
    exclude: Option[List[String]] = None,
    ignoreMode: Option[software.amazon.awscdk.IgnoreMode] = None,
    assetHashType: Option[software.amazon.awscdk.AssetHashType] = None,
    readers: Option[List[_ <: software.amazon.awscdk.services.iam.IGrantable]] = None
  ): software.amazon.awscdk.services.lambda.AssetCode =
    software.amazon.awscdk.services.lambda.AssetCode.Builder
      .create(path)
      .assetHash(assetHash.orNull)
      .bundling(bundling.orNull)
      .followSymlinks(followSymlinks.orNull)
      .exclude(exclude.map(_.asJava).orNull)
      .ignoreMode(ignoreMode.orNull)
      .assetHashType(assetHashType.orNull)
      .readers(readers.map(_.asJava).orNull)
      .build()
}
