package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RedshiftParametersProperty {

  def apply(
    database: String,
    host: Option[String] = None,
    clusterId: Option[String] = None,
    port: Option[Number] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSource.RedshiftParametersProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSource.RedshiftParametersProperty.Builder)
      .database(database)
      .host(host.orNull)
      .clusterId(clusterId.orNull)
      .port(port.orNull)
      .build()
}
