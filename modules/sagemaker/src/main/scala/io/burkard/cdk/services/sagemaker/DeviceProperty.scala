package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DeviceProperty {

  def apply(
    deviceName: String,
    description: Option[String] = None,
    iotThingName: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnDevice.DeviceProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnDevice.DeviceProperty.Builder)
      .deviceName(deviceName)
      .description(description.orNull)
      .iotThingName(iotThingName.orNull)
      .build()
}
