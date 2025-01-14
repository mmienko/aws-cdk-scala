package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ParquetConfigurationProperty {

  def apply(
    schemaDefinition: Option[software.amazon.awscdk.services.iotanalytics.CfnDatastore.SchemaDefinitionProperty] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDatastore.ParquetConfigurationProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDatastore.ParquetConfigurationProperty.Builder)
      .schemaDefinition(schemaDefinition.orNull)
      .build()
}
