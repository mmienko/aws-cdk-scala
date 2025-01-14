package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDeviceFleetProps {

  def apply(
    deviceFleetName: String,
    outputConfig: software.amazon.awscdk.services.sagemaker.CfnDeviceFleet.EdgeOutputConfigProperty,
    roleArn: String,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.sagemaker.CfnDeviceFleetProps =
    (new software.amazon.awscdk.services.sagemaker.CfnDeviceFleetProps.Builder)
      .deviceFleetName(deviceFleetName)
      .outputConfig(outputConfig)
      .roleArn(roleArn)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
