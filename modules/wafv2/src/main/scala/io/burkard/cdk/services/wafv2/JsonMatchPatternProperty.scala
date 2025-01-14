package io.burkard.cdk.services.wafv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object JsonMatchPatternProperty {

  def apply(
    all: Option[AnyRef] = None,
    includedPaths: Option[List[String]] = None
  ): software.amazon.awscdk.services.wafv2.CfnWebACL.JsonMatchPatternProperty =
    (new software.amazon.awscdk.services.wafv2.CfnWebACL.JsonMatchPatternProperty.Builder)
      .all(all.orNull)
      .includedPaths(includedPaths.map(_.asJava).orNull)
      .build()
}
