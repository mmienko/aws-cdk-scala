package io.burkard.cdk.services.groundstation

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FrequencyProperty {

  def apply(
    units: Option[String] = None,
    value: Option[Number] = None
  ): software.amazon.awscdk.services.groundstation.CfnConfig.FrequencyProperty =
    (new software.amazon.awscdk.services.groundstation.CfnConfig.FrequencyProperty.Builder)
      .units(units.orNull)
      .value(value.orNull)
      .build()
}
