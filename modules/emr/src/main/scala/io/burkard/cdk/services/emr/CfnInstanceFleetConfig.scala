package io.burkard.cdk.services.emr

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnInstanceFleetConfig {

  def apply(
    internalResourceId: String,
    instanceTypeConfigs: Option[List[_]] = None,
    clusterId: Option[String] = None,
    launchSpecifications: Option[software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty] = None,
    instanceFleetType: Option[String] = None,
    targetSpotCapacity: Option[Number] = None,
    name: Option[String] = None,
    targetOnDemandCapacity: Option[Number] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.emr.CfnInstanceFleetConfig =
    software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.Builder
      .create(stackCtx, internalResourceId)
      .instanceTypeConfigs(instanceTypeConfigs.map(_.asJava).orNull)
      .clusterId(clusterId.orNull)
      .launchSpecifications(launchSpecifications.orNull)
      .instanceFleetType(instanceFleetType.orNull)
      .targetSpotCapacity(targetSpotCapacity.orNull)
      .name(name.orNull)
      .targetOnDemandCapacity(targetOnDemandCapacity.orNull)
      .build()
}