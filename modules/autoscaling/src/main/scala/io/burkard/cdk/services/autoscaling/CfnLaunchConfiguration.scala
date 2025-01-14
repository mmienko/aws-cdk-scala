package io.burkard.cdk.services.autoscaling

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLaunchConfiguration {

  def apply(
    internalResourceId: String,
    instanceType: String,
    imageId: String,
    instanceId: Option[String] = None,
    ebsOptimized: Option[Boolean] = None,
    userData: Option[String] = None,
    iamInstanceProfile: Option[String] = None,
    metadataOptions: Option[software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.MetadataOptionsProperty] = None,
    ramDiskId: Option[String] = None,
    launchConfigurationName: Option[String] = None,
    classicLinkVpcId: Option[String] = None,
    associatePublicIpAddress: Option[Boolean] = None,
    classicLinkVpcSecurityGroups: Option[List[String]] = None,
    securityGroups: Option[List[String]] = None,
    keyName: Option[String] = None,
    instanceMonitoring: Option[Boolean] = None,
    spotPrice: Option[String] = None,
    kernelId: Option[String] = None,
    placementTenancy: Option[String] = None,
    blockDeviceMappings: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration =
    software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.Builder
      .create(stackCtx, internalResourceId)
      .instanceType(instanceType)
      .imageId(imageId)
      .instanceId(instanceId.orNull)
      .ebsOptimized(ebsOptimized.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .userData(userData.orNull)
      .iamInstanceProfile(iamInstanceProfile.orNull)
      .metadataOptions(metadataOptions.orNull)
      .ramDiskId(ramDiskId.orNull)
      .launchConfigurationName(launchConfigurationName.orNull)
      .classicLinkVpcId(classicLinkVpcId.orNull)
      .associatePublicIpAddress(associatePublicIpAddress.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .classicLinkVpcSecurityGroups(classicLinkVpcSecurityGroups.map(_.asJava).orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .keyName(keyName.orNull)
      .instanceMonitoring(instanceMonitoring.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .spotPrice(spotPrice.orNull)
      .kernelId(kernelId.orNull)
      .placementTenancy(placementTenancy.orNull)
      .blockDeviceMappings(blockDeviceMappings.map(_.asJava).orNull)
      .build()
}
