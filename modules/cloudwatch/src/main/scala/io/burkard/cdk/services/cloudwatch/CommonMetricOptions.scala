package io.burkard.cdk.services.cloudwatch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CommonMetricOptions {

  def apply(
    statistic: Option[String] = None,
    label: Option[String] = None,
    color: Option[String] = None,
    region: Option[String] = None,
    dimensionsMap: Option[Map[String, String]] = None,
    period: Option[software.amazon.awscdk.Duration] = None,
    account: Option[String] = None,
    unit: Option[software.amazon.awscdk.services.cloudwatch.Unit] = None
  ): software.amazon.awscdk.services.cloudwatch.CommonMetricOptions =
    (new software.amazon.awscdk.services.cloudwatch.CommonMetricOptions.Builder)
      .statistic(statistic.orNull)
      .label(label.orNull)
      .color(color.orNull)
      .region(region.orNull)
      .dimensionsMap(dimensionsMap.map(_.asJava).orNull)
      .period(period.orNull)
      .account(account.orNull)
      .unit(unit.orNull)
      .build()
}
