package io.burkard.cdk.services.emr

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScriptBootstrapActionConfigProperty {

  def apply(
    path: String,
    args: Option[List[String]] = None
  ): software.amazon.awscdk.services.emr.CfnCluster.ScriptBootstrapActionConfigProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.ScriptBootstrapActionConfigProperty.Builder)
      .path(path)
      .args(args.map(_.asJava).orNull)
      .build()
}
