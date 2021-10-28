package io.burkard.cdk.services.cloudwatch

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAlarmProps {

  def apply(
    statistic: Option[String] = None,
    insufficientDataActions: Option[List[String]] = None,
    evaluateLowSampleCountPercentile: Option[String] = None,
    okActions: Option[List[String]] = None,
    comparisonOperator: Option[String] = None,
    treatMissingData: Option[String] = None,
    threshold: Option[Number] = None,
    unit: Option[String] = None,
    alarmActions: Option[List[String]] = None,
    evaluationPeriods: Option[Number] = None,
    metricName: Option[String] = None,
    datapointsToAlarm: Option[Number] = None,
    dimensions: Option[List[_]] = None,
    thresholdMetricId: Option[String] = None,
    metrics: Option[List[_]] = None,
    actionsEnabled: Option[Boolean] = None,
    alarmName: Option[String] = None,
    period: Option[Number] = None,
    namespace: Option[String] = None,
    extendedStatistic: Option[String] = None,
    alarmDescription: Option[String] = None
  ): software.amazon.awscdk.services.cloudwatch.CfnAlarmProps =
    (new software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder)
      .statistic(statistic.orNull)
      .insufficientDataActions(insufficientDataActions.map(_.asJava).orNull)
      .evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile.orNull)
      .okActions(okActions.map(_.asJava).orNull)
      .comparisonOperator(comparisonOperator.orNull)
      .treatMissingData(treatMissingData.orNull)
      .threshold(threshold.orNull)
      .unit(unit.orNull)
      .alarmActions(alarmActions.map(_.asJava).orNull)
      .evaluationPeriods(evaluationPeriods.orNull)
      .metricName(metricName.orNull)
      .datapointsToAlarm(datapointsToAlarm.orNull)
      .dimensions(dimensions.map(_.asJava).orNull)
      .thresholdMetricId(thresholdMetricId.orNull)
      .metrics(metrics.map(_.asJava).orNull)
      .actionsEnabled(actionsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .alarmName(alarmName.orNull)
      .period(period.orNull)
      .namespace(namespace.orNull)
      .extendedStatistic(extendedStatistic.orNull)
      .alarmDescription(alarmDescription.orNull)
      .build()
}