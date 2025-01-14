package io.burkard.cdk.cxapi

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetadataEntryResult {

  def apply(
    path: String,
    data0: Option[software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetMetadataEntry] = None,
    data1: Option[List[_ <: software.amazon.awscdk.cloudassembly.schema.Tag]] = None,
    data2: Option[software.amazon.awscdk.cloudassembly.schema.FileAssetMetadataEntry] = None,
    data3: Option[String] = None,
    `type`: Option[String] = None,
    trace: Option[List[String]] = None
  ): software.amazon.awscdk.cxapi.MetadataEntryResult =
    (new software.amazon.awscdk.cxapi.MetadataEntryResult.Builder)
      .path(path)
      .data(data0.orNull)
      .data(data1.map(_.asJava).orNull)
      .data(data2.orNull)
      .data(data3.orNull)
      .`type`(`type`.orNull)
      .trace(trace.map(_.asJava).orNull)
      .build()
}
