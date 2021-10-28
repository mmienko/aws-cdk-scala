package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object KeyValueProperty {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.emr.CfnCluster.KeyValueProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.KeyValueProperty.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}