package io.burkard.cdk.services.eks

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NodegroupProps {

  def apply(
    subnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    diskSize: Option[Number] = None,
    taints: Option[List[_ <: software.amazon.awscdk.services.eks.TaintSpec]] = None,
    instanceTypes: Option[List[_ <: software.amazon.awscdk.services.ec2.InstanceType]] = None,
    cluster: Option[software.amazon.awscdk.services.eks.ICluster] = None,
    labels: Option[Map[String, String]] = None,
    releaseVersion: Option[String] = None,
    remoteAccess: Option[software.amazon.awscdk.services.eks.NodegroupRemoteAccess] = None,
    minSize: Option[Number] = None,
    nodegroupName: Option[String] = None,
    desiredSize: Option[Number] = None,
    tags: Option[Map[String, String]] = None,
    forceUpdate: Option[Boolean] = None,
    nodeRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    launchTemplateSpec: Option[software.amazon.awscdk.services.eks.LaunchTemplateSpec] = None,
    amiType: Option[software.amazon.awscdk.services.eks.NodegroupAmiType] = None,
    capacityType: Option[software.amazon.awscdk.services.eks.CapacityType] = None,
    maxSize: Option[Number] = None
  ): software.amazon.awscdk.services.eks.NodegroupProps =
    (new software.amazon.awscdk.services.eks.NodegroupProps.Builder)
      .subnets(subnets.orNull)
      .diskSize(diskSize.orNull)
      .taints(taints.map(_.asJava).orNull)
      .instanceTypes(instanceTypes.map(_.asJava).orNull)
      .cluster(cluster.orNull)
      .labels(labels.map(_.asJava).orNull)
      .releaseVersion(releaseVersion.orNull)
      .remoteAccess(remoteAccess.orNull)
      .minSize(minSize.orNull)
      .nodegroupName(nodegroupName.orNull)
      .desiredSize(desiredSize.orNull)
      .tags(tags.map(_.asJava).orNull)
      .forceUpdate(forceUpdate.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .nodeRole(nodeRole.orNull)
      .launchTemplateSpec(launchTemplateSpec.orNull)
      .amiType(amiType.orNull)
      .capacityType(capacityType.orNull)
      .maxSize(maxSize.orNull)
      .build()
}