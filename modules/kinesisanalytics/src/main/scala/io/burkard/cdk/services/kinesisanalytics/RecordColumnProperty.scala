package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RecordColumnProperty {

  def apply(
    name: Option[String] = None,
    mapping: Option[String] = None,
    sqlType: Option[String] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordColumnProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordColumnProperty.Builder)
      .name(name.orNull)
      .mapping(mapping.orNull)
      .sqlType(sqlType.orNull)
      .build()
}
