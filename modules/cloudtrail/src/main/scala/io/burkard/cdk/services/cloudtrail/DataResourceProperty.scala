package io.burkard.cdk.services.cloudtrail

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DataResourceProperty {

  def apply(
    `type`: String,
    values: Option[List[String]] = None
  ): software.amazon.awscdk.services.cloudtrail.CfnTrail.DataResourceProperty =
    (new software.amazon.awscdk.services.cloudtrail.CfnTrail.DataResourceProperty.Builder)
      .`type`(`type`)
      .values(values.map(_.asJava).orNull)
      .build()
}
