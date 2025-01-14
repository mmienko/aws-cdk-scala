package io.burkard.cdk.services.glue

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
