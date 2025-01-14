package io.burkard.cdk.services.iot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnScheduledAuditProps {

  def apply(
    targetCheckNames: List[String],
    frequency: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    dayOfMonth: Option[String] = None,
    scheduledAuditName: Option[String] = None,
    dayOfWeek: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnScheduledAuditProps =
    (new software.amazon.awscdk.services.iot.CfnScheduledAuditProps.Builder)
      .targetCheckNames(targetCheckNames.asJava)
      .frequency(frequency)
      .tags(tags.map(_.asJava).orNull)
      .dayOfMonth(dayOfMonth.orNull)
      .scheduledAuditName(scheduledAuditName.orNull)
      .dayOfWeek(dayOfWeek.orNull)
      .build()
}
