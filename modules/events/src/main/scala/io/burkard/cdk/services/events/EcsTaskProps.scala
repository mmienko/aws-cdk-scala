package io.burkard.cdk.services.events

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EcsTaskProps {

  def apply(
    cluster: software.amazon.awscdk.services.ecs.ICluster,
    taskDefinition: software.amazon.awscdk.services.ecs.ITaskDefinition,
    taskCount: Option[Number] = None,
    containerOverrides: Option[List[_ <: software.amazon.awscdk.services.events.targets.ContainerOverride]] = None,
    subnetSelection: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    platformVersion: Option[software.amazon.awscdk.services.ecs.FargatePlatformVersion] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None
  ): software.amazon.awscdk.services.events.targets.EcsTaskProps =
    (new software.amazon.awscdk.services.events.targets.EcsTaskProps.Builder)
      .cluster(cluster)
      .taskDefinition(taskDefinition)
      .taskCount(taskCount.orNull)
      .containerOverrides(containerOverrides.map(_.asJava).orNull)
      .subnetSelection(subnetSelection.orNull)
      .platformVersion(platformVersion.orNull)
      .role(role.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .build()
}
