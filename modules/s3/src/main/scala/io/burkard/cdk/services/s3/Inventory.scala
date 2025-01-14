package io.burkard.cdk.services.s3

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Inventory {

  def apply(
    destination: software.amazon.awscdk.services.s3.InventoryDestination,
    format: Option[software.amazon.awscdk.services.s3.InventoryFormat] = None,
    inventoryId: Option[String] = None,
    optionalFields: Option[List[String]] = None,
    objectsPrefix: Option[String] = None,
    frequency: Option[software.amazon.awscdk.services.s3.InventoryFrequency] = None,
    enabled: Option[Boolean] = None,
    includeObjectVersions: Option[software.amazon.awscdk.services.s3.InventoryObjectVersion] = None
  ): software.amazon.awscdk.services.s3.Inventory =
    (new software.amazon.awscdk.services.s3.Inventory.Builder)
      .destination(destination)
      .format(format.orNull)
      .inventoryId(inventoryId.orNull)
      .optionalFields(optionalFields.map(_.asJava).orNull)
      .objectsPrefix(objectsPrefix.orNull)
      .frequency(frequency.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .includeObjectVersions(includeObjectVersions.orNull)
      .build()
}
