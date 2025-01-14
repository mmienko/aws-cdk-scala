package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SpotFleetRequestConfigDataProperty {

  def apply(
    targetCapacity: Number,
    iamFleetRole: String,
    onDemandTargetCapacity: Option[Number] = None,
    launchTemplateConfigs: Option[List[_]] = None,
    validUntil: Option[String] = None,
    context: Option[String] = None,
    instanceInterruptionBehavior: Option[String] = None,
    validFrom: Option[String] = None,
    loadBalancersConfig: Option[software.amazon.awscdk.services.ec2.CfnSpotFleet.LoadBalancersConfigProperty] = None,
    excessCapacityTerminationPolicy: Option[String] = None,
    replaceUnhealthyInstances: Option[Boolean] = None,
    targetCapacityUnitType: Option[String] = None,
    onDemandMaxTotalPrice: Option[String] = None,
    allocationStrategy: Option[String] = None,
    instancePoolsToUseCount: Option[Number] = None,
    onDemandAllocationStrategy: Option[String] = None,
    launchSpecifications: Option[List[_]] = None,
    spotMaxTotalPrice: Option[String] = None,
    `type`: Option[String] = None,
    terminateInstancesWithExpiration: Option[Boolean] = None,
    spotMaintenanceStrategies: Option[software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotMaintenanceStrategiesProperty] = None,
    spotPrice: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetRequestConfigDataProperty =
    (new software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetRequestConfigDataProperty.Builder)
      .targetCapacity(targetCapacity)
      .iamFleetRole(iamFleetRole)
      .onDemandTargetCapacity(onDemandTargetCapacity.orNull)
      .launchTemplateConfigs(launchTemplateConfigs.map(_.asJava).orNull)
      .validUntil(validUntil.orNull)
      .context(context.orNull)
      .instanceInterruptionBehavior(instanceInterruptionBehavior.orNull)
      .validFrom(validFrom.orNull)
      .loadBalancersConfig(loadBalancersConfig.orNull)
      .excessCapacityTerminationPolicy(excessCapacityTerminationPolicy.orNull)
      .replaceUnhealthyInstances(replaceUnhealthyInstances.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .targetCapacityUnitType(targetCapacityUnitType.orNull)
      .onDemandMaxTotalPrice(onDemandMaxTotalPrice.orNull)
      .allocationStrategy(allocationStrategy.orNull)
      .instancePoolsToUseCount(instancePoolsToUseCount.orNull)
      .onDemandAllocationStrategy(onDemandAllocationStrategy.orNull)
      .launchSpecifications(launchSpecifications.map(_.asJava).orNull)
      .spotMaxTotalPrice(spotMaxTotalPrice.orNull)
      .`type`(`type`.orNull)
      .terminateInstancesWithExpiration(terminateInstancesWithExpiration.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .spotMaintenanceStrategies(spotMaintenanceStrategies.orNull)
      .spotPrice(spotPrice.orNull)
      .build()
}
