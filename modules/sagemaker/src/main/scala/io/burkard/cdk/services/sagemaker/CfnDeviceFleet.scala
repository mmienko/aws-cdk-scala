package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDeviceFleet {

  def apply(
    internalResourceId: String,
    deviceFleetName: String,
    outputConfig: software.amazon.awscdk.services.sagemaker.CfnDeviceFleet.EdgeOutputConfigProperty,
    roleArn: String,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sagemaker.CfnDeviceFleet =
    software.amazon.awscdk.services.sagemaker.CfnDeviceFleet.Builder
      .create(stackCtx, internalResourceId)
      .deviceFleetName(deviceFleetName)
      .outputConfig(outputConfig)
      .roleArn(roleArn)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
