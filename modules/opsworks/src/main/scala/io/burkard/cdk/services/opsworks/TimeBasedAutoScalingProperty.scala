package io.burkard.cdk.services.opsworks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TimeBasedAutoScalingProperty {

  def apply(
    sunday: Option[Map[String, String]] = None,
    tuesday: Option[Map[String, String]] = None,
    wednesday: Option[Map[String, String]] = None,
    monday: Option[Map[String, String]] = None,
    friday: Option[Map[String, String]] = None,
    thursday: Option[Map[String, String]] = None,
    saturday: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.opsworks.CfnInstance.TimeBasedAutoScalingProperty =
    (new software.amazon.awscdk.services.opsworks.CfnInstance.TimeBasedAutoScalingProperty.Builder)
      .sunday(sunday.map(_.asJava).orNull)
      .tuesday(tuesday.map(_.asJava).orNull)
      .wednesday(wednesday.map(_.asJava).orNull)
      .monday(monday.map(_.asJava).orNull)
      .friday(friday.map(_.asJava).orNull)
      .thursday(thursday.map(_.asJava).orNull)
      .saturday(saturday.map(_.asJava).orNull)
      .build()
}
