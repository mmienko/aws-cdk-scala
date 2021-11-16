package io.burkard.cdk.services.waf

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnXssMatchSet {

  def apply(
    internalResourceId: String,
    name: String,
    xssMatchTuples: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.waf.regional.CfnXssMatchSet =
    software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .xssMatchTuples(xssMatchTuples.map(_.asJava).orNull)
      .build()
}
