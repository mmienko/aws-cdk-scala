package io.burkard.cdk.services.ssm

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMaintenanceWindowTarget {

  def apply(
    internalResourceId: String,
    windowId: String,
    targets: List[_],
    resourceType: String,
    name: Option[String] = None,
    ownerInformation: Option[String] = None,
    description: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget =
    software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget.Builder
      .create(stackCtx, internalResourceId)
      .windowId(windowId)
      .targets(targets.asJava)
      .resourceType(resourceType)
      .name(name.orNull)
      .ownerInformation(ownerInformation.orNull)
      .description(description.orNull)
      .build()
}
