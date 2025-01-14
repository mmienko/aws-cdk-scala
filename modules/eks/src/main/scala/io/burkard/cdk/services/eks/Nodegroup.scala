package io.burkard.cdk.services.eks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Nodegroup {

  def apply(
    internalResourceId: String,
    cluster: software.amazon.awscdk.services.eks.ICluster,
    subnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    diskSize: Option[Number] = None,
    taints: Option[List[_ <: software.amazon.awscdk.services.eks.TaintSpec]] = None,
    instanceTypes: Option[List[_ <: software.amazon.awscdk.services.ec2.InstanceType]] = None,
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
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.eks.Nodegroup =
    software.amazon.awscdk.services.eks.Nodegroup.Builder
      .create(stackCtx, internalResourceId)
      .cluster(cluster)
      .subnets(subnets.orNull)
      .diskSize(diskSize.orNull)
      .taints(taints.map(_.asJava).orNull)
      .instanceTypes(instanceTypes.map(_.asJava).orNull)
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
