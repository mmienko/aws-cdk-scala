package io.burkard.cdk.services.applicationinsights

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object JMXPrometheusExporterProperty {

  def apply(
    hostPort: Option[String] = None,
    prometheusPort: Option[String] = None,
    jmxurl: Option[String] = None
  ): software.amazon.awscdk.services.applicationinsights.CfnApplication.JMXPrometheusExporterProperty =
    (new software.amazon.awscdk.services.applicationinsights.CfnApplication.JMXPrometheusExporterProperty.Builder)
      .hostPort(hostPort.orNull)
      .prometheusPort(prometheusPort.orNull)
      .jmxurl(jmxurl.orNull)
      .build()
}
