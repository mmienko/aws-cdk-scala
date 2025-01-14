package io.burkard.cdk.services.iotevents

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StateProperty {

  def apply(
    stateName: String,
    onInput: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnInputProperty] = None,
    onExit: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnExitProperty] = None,
    onEnter: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnEnterProperty] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.StateProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.StateProperty.Builder)
      .stateName(stateName)
      .onInput(onInput.orNull)
      .onExit(onExit.orNull)
      .onEnter(onEnter.orNull)
      .build()
}
