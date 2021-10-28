package io.burkard.cdk.services.glue

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SkewedInfoProperty {

  def apply(
    skewedColumnNames: Option[List[String]] = None,
    skewedColumnValueLocationMaps: Option[AnyRef] = None,
    skewedColumnValues: Option[List[String]] = None
  ): software.amazon.awscdk.services.glue.CfnPartition.SkewedInfoProperty =
    (new software.amazon.awscdk.services.glue.CfnPartition.SkewedInfoProperty.Builder)
      .skewedColumnNames(skewedColumnNames.map(_.asJava).orNull)
      .skewedColumnValueLocationMaps(skewedColumnValueLocationMaps.orNull)
      .skewedColumnValues(skewedColumnValues.map(_.asJava).orNull)
      .build()
}