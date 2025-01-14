package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GlueConfigurationProperty {

  def apply(
    tableName: String,
    databaseName: String
  ): software.amazon.awscdk.services.iotanalytics.CfnDataset.GlueConfigurationProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDataset.GlueConfigurationProperty.Builder)
      .tableName(tableName)
      .databaseName(databaseName)
      .build()
}
