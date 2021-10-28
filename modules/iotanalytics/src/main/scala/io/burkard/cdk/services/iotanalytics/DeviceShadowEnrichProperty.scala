package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DeviceShadowEnrichProperty {

  def apply(
    name: Option[String] = None,
    thingName: Option[String] = None,
    roleArn: Option[String] = None,
    next: Option[String] = None,
    attribute: Option[String] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceShadowEnrichProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceShadowEnrichProperty.Builder)
      .name(name.orNull)
      .thingName(thingName.orNull)
      .roleArn(roleArn.orNull)
      .next(next.orNull)
      .attribute(attribute.orNull)
      .build()
}