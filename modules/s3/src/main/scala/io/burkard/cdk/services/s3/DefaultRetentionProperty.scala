package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DefaultRetentionProperty {

  def apply(
    years: Option[Number] = None,
    mode: Option[String] = None,
    days: Option[Number] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.DefaultRetentionProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.DefaultRetentionProperty.Builder)
      .years(years.orNull)
      .mode(mode.orNull)
      .days(days.orNull)
      .build()
}
