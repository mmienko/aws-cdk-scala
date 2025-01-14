package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DynamoDBConfigProperty {

  def apply(
    awsRegion: String,
    tableName: String,
    deltaSyncConfig: Option[software.amazon.awscdk.services.appsync.CfnDataSource.DeltaSyncConfigProperty] = None,
    useCallerCredentials: Option[Boolean] = None,
    versioned: Option[Boolean] = None
  ): software.amazon.awscdk.services.appsync.CfnDataSource.DynamoDBConfigProperty =
    (new software.amazon.awscdk.services.appsync.CfnDataSource.DynamoDBConfigProperty.Builder)
      .awsRegion(awsRegion)
      .tableName(tableName)
      .deltaSyncConfig(deltaSyncConfig.orNull)
      .useCallerCredentials(useCallerCredentials.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .versioned(versioned.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
