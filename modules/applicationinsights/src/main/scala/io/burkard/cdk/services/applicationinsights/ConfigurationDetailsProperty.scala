package io.burkard.cdk.services.applicationinsights

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ConfigurationDetailsProperty {

  def apply(
    alarmMetrics: Option[List[_]] = None,
    windowsEvents: Option[List[_]] = None,
    alarms: Option[List[_]] = None,
    jmxPrometheusExporter: Option[software.amazon.awscdk.services.applicationinsights.CfnApplication.JMXPrometheusExporterProperty] = None,
    logs: Option[List[_]] = None
  ): software.amazon.awscdk.services.applicationinsights.CfnApplication.ConfigurationDetailsProperty =
    (new software.amazon.awscdk.services.applicationinsights.CfnApplication.ConfigurationDetailsProperty.Builder)
      .alarmMetrics(alarmMetrics.map(_.asJava).orNull)
      .windowsEvents(windowsEvents.map(_.asJava).orNull)
      .alarms(alarms.map(_.asJava).orNull)
      .jmxPrometheusExporter(jmxPrometheusExporter.orNull)
      .logs(logs.map(_.asJava).orNull)
      .build()
}