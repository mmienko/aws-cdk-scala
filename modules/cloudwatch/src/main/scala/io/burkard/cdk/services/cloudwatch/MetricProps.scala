package io.burkard.cdk.services.cloudwatch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricProps {

  def apply(
    statistic: Option[String] = None,
    label: Option[String] = None,
    metricName: Option[String] = None,
    color: Option[String] = None,
    dimensionsMap: Option[Map[String, String]] = None,
    period: Option[software.amazon.awscdk.Duration] = None,
    namespace: Option[String] = None,
    dimensions: Option[Map[String, _]] = None,
    region: Option[String] = None,
    account: Option[String] = None,
    unit: Option[software.amazon.awscdk.services.cloudwatch.Unit] = None
  ): software.amazon.awscdk.services.cloudwatch.MetricProps =
    (new software.amazon.awscdk.services.cloudwatch.MetricProps.Builder)
      .statistic(statistic.orNull)
      .label(label.orNull)
      .metricName(metricName.orNull)
      .color(color.orNull)
      .dimensionsMap(dimensionsMap.map(_.asJava).orNull)
      .period(period.orNull)
      .namespace(namespace.orNull)
      .dimensions(dimensions.map(_.asJava).orNull)
      .region(region.orNull)
      .account(account.orNull)
      .unit(unit.orNull)
      .build()
}
