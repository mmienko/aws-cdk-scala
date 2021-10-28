package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DataCatalogInputDefinitionProperty {

  def apply(
    tempDirectory: Option[software.amazon.awscdk.services.databrew.CfnRecipe.S3LocationProperty] = None,
    tableName: Option[String] = None,
    catalogId: Option[String] = None,
    databaseName: Option[String] = None
  ): software.amazon.awscdk.services.databrew.CfnRecipe.DataCatalogInputDefinitionProperty =
    (new software.amazon.awscdk.services.databrew.CfnRecipe.DataCatalogInputDefinitionProperty.Builder)
      .tempDirectory(tempDirectory.orNull)
      .tableName(tableName.orNull)
      .catalogId(catalogId.orNull)
      .databaseName(databaseName.orNull)
      .build()
}