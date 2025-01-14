package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SpotFleetLaunchSpecificationProperty {

  def apply(
    imageId: String,
    ebsOptimized: Option[Boolean] = None,
    tagSpecifications: Option[List[_]] = None,
    networkInterfaces: Option[List[_]] = None,
    monitoring: Option[software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetMonitoringProperty] = None,
    userData: Option[String] = None,
    iamInstanceProfile: Option[software.amazon.awscdk.services.ec2.CfnSpotFleet.IamInstanceProfileSpecificationProperty] = None,
    instanceType: Option[String] = None,
    instanceRequirements: Option[software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceRequirementsRequestProperty] = None,
    placement: Option[software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotPlacementProperty] = None,
    weightedCapacity: Option[Number] = None,
    blockDeviceMappings: Option[List[_]] = None,
    subnetId: Option[String] = None,
    ramdiskId: Option[String] = None,
    securityGroups: Option[List[_]] = None,
    keyName: Option[String] = None,
    spotPrice: Option[String] = None,
    kernelId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetLaunchSpecificationProperty =
    (new software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetLaunchSpecificationProperty.Builder)
      .imageId(imageId)
      .ebsOptimized(ebsOptimized.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .tagSpecifications(tagSpecifications.map(_.asJava).orNull)
      .networkInterfaces(networkInterfaces.map(_.asJava).orNull)
      .monitoring(monitoring.orNull)
      .userData(userData.orNull)
      .iamInstanceProfile(iamInstanceProfile.orNull)
      .instanceType(instanceType.orNull)
      .instanceRequirements(instanceRequirements.orNull)
      .placement(placement.orNull)
      .weightedCapacity(weightedCapacity.orNull)
      .blockDeviceMappings(blockDeviceMappings.map(_.asJava).orNull)
      .subnetId(subnetId.orNull)
      .ramdiskId(ramdiskId.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .keyName(keyName.orNull)
      .spotPrice(spotPrice.orNull)
      .kernelId(kernelId.orNull)
      .build()
}
