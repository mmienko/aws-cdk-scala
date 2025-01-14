package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TagFormatProperty {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.rds.CfnDBProxy.TagFormatProperty =
    (new software.amazon.awscdk.services.rds.CfnDBProxy.TagFormatProperty.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
