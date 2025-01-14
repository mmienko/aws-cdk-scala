package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDataSourceProps {

  def apply(
    name: String,
    apiId: String,
    `type`: String,
    openSearchServiceConfig: Option[software.amazon.awscdk.services.appsync.CfnDataSource.OpenSearchServiceConfigProperty] = None,
    elasticsearchConfig: Option[software.amazon.awscdk.services.appsync.CfnDataSource.ElasticsearchConfigProperty] = None,
    description: Option[String] = None,
    serviceRoleArn: Option[String] = None,
    lambdaConfig: Option[software.amazon.awscdk.services.appsync.CfnDataSource.LambdaConfigProperty] = None,
    httpConfig: Option[software.amazon.awscdk.services.appsync.CfnDataSource.HttpConfigProperty] = None,
    relationalDatabaseConfig: Option[software.amazon.awscdk.services.appsync.CfnDataSource.RelationalDatabaseConfigProperty] = None,
    dynamoDbConfig: Option[software.amazon.awscdk.services.appsync.CfnDataSource.DynamoDBConfigProperty] = None
  ): software.amazon.awscdk.services.appsync.CfnDataSourceProps =
    (new software.amazon.awscdk.services.appsync.CfnDataSourceProps.Builder)
      .name(name)
      .apiId(apiId)
      .`type`(`type`)
      .openSearchServiceConfig(openSearchServiceConfig.orNull)
      .elasticsearchConfig(elasticsearchConfig.orNull)
      .description(description.orNull)
      .serviceRoleArn(serviceRoleArn.orNull)
      .lambdaConfig(lambdaConfig.orNull)
      .httpConfig(httpConfig.orNull)
      .relationalDatabaseConfig(relationalDatabaseConfig.orNull)
      .dynamoDbConfig(dynamoDbConfig.orNull)
      .build()
}
