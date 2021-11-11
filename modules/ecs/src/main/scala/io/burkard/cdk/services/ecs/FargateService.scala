package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FargateService {

  def apply(
    internalResourceId: String,
    minHealthyPercent: Option[Number] = None,
    healthCheckGracePeriod: Option[software.amazon.awscdk.Duration] = None,
    platformVersion: Option[software.amazon.awscdk.services.ecs.FargatePlatformVersion] = None,
    desiredCount: Option[Number] = None,
    serviceName: Option[String] = None,
    propagateTaskTagsFrom: Option[software.amazon.awscdk.services.ecs.PropagatedTagSource] = None,
    enableExecuteCommand: Option[Boolean] = None,
    maxHealthyPercent: Option[Number] = None,
    deploymentController: Option[software.amazon.awscdk.services.ecs.DeploymentController] = None,
    cloudMapOptions: Option[software.amazon.awscdk.services.ecs.CloudMapOptions] = None,
    capacityProviderStrategies: Option[List[_ <: software.amazon.awscdk.services.ecs.CapacityProviderStrategy]] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None,
    circuitBreaker: Option[software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    cluster: Option[software.amazon.awscdk.services.ecs.ICluster] = None,
    assignPublicIp: Option[Boolean] = None,
    propagateTags: Option[software.amazon.awscdk.services.ecs.PropagatedTagSource] = None,
    enableEcsManagedTags: Option[Boolean] = None,
    taskDefinition: Option[software.amazon.awscdk.services.ecs.TaskDefinition] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ecs.FargateService =
    software.amazon.awscdk.services.ecs.FargateService.Builder
      .create(stackCtx, internalResourceId)
      .minHealthyPercent(minHealthyPercent.orNull)
      .healthCheckGracePeriod(healthCheckGracePeriod.orNull)
      .platformVersion(platformVersion.orNull)
      .desiredCount(desiredCount.orNull)
      .serviceName(serviceName.orNull)
      .propagateTaskTagsFrom(propagateTaskTagsFrom.orNull)
      .enableExecuteCommand(enableExecuteCommand.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .maxHealthyPercent(maxHealthyPercent.orNull)
      .deploymentController(deploymentController.orNull)
      .cloudMapOptions(cloudMapOptions.orNull)
      .capacityProviderStrategies(capacityProviderStrategies.map(_.asJava).orNull)
      .securityGroup(securityGroup.orNull)
      .circuitBreaker(circuitBreaker.orNull)
      .vpcSubnets(vpcSubnets.orNull)
      .cluster(cluster.orNull)
      .assignPublicIp(assignPublicIp.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .propagateTags(propagateTags.orNull)
      .enableEcsManagedTags(enableEcsManagedTags.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .taskDefinition(taskDefinition.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .build()
}
