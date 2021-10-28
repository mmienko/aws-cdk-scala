package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RelationalDatabaseConfigProperty {

  def apply(
    rdsHttpEndpointConfig: Option[software.amazon.awscdk.services.appsync.CfnDataSource.RdsHttpEndpointConfigProperty] = None,
    relationalDatabaseSourceType: Option[String] = None
  ): software.amazon.awscdk.services.appsync.CfnDataSource.RelationalDatabaseConfigProperty =
    (new software.amazon.awscdk.services.appsync.CfnDataSource.RelationalDatabaseConfigProperty.Builder)
      .rdsHttpEndpointConfig(rdsHttpEndpointConfig.orNull)
      .relationalDatabaseSourceType(relationalDatabaseSourceType.orNull)
      .build()
}