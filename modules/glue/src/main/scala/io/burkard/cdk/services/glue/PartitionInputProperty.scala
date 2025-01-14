package io.burkard.cdk.services.glue

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PartitionInputProperty {

  def apply(
    values: List[String],
    parameters: Option[AnyRef] = None,
    storageDescriptor: Option[software.amazon.awscdk.services.glue.CfnPartition.StorageDescriptorProperty] = None
  ): software.amazon.awscdk.services.glue.CfnPartition.PartitionInputProperty =
    (new software.amazon.awscdk.services.glue.CfnPartition.PartitionInputProperty.Builder)
      .values(values.asJava)
      .parameters(parameters.orNull)
      .storageDescriptor(storageDescriptor.orNull)
      .build()
}
