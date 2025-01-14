package io.burkard.cdk.services.iotevents

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DetectorModelDefinitionProperty {

  def apply(
    initialStateName: String,
    states: List[_]
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.DetectorModelDefinitionProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.DetectorModelDefinitionProperty.Builder)
      .initialStateName(initialStateName)
      .states(states.asJava)
      .build()
}
