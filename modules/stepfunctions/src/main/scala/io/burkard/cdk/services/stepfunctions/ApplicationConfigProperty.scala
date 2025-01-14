package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApplicationConfigProperty {

  def apply(
    name: String,
    version: Option[String] = None,
    additionalInfo: Option[Map[String, String]] = None,
    args: Option[List[String]] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ApplicationConfigProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ApplicationConfigProperty.Builder)
      .name(name)
      .version(version.orNull)
      .additionalInfo(additionalInfo.map(_.asJava).orNull)
      .args(args.map(_.asJava).orNull)
      .build()
}
