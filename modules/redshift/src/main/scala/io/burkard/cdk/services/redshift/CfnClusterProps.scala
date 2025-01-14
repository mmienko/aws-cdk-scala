package io.burkard.cdk.services.redshift

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnClusterProps {

  def apply(
    dbName: String,
    masterUserPassword: String,
    nodeType: String,
    clusterType: String,
    masterUsername: String,
    snapshotIdentifier: Option[String] = None,
    enhancedVpcRouting: Option[Boolean] = None,
    clusterIdentifier: Option[String] = None,
    availabilityZone: Option[String] = None,
    classic: Option[Boolean] = None,
    preferredMaintenanceWindow: Option[String] = None,
    clusterParameterGroupName: Option[String] = None,
    automatedSnapshotRetentionPeriod: Option[Number] = None,
    encrypted: Option[Boolean] = None,
    port: Option[Number] = None,
    deferMaintenanceStartTime: Option[String] = None,
    snapshotCopyRetentionPeriod: Option[Number] = None,
    rotateEncryptionKey: Option[Boolean] = None,
    kmsKeyId: Option[String] = None,
    loggingProperties: Option[software.amazon.awscdk.services.redshift.CfnCluster.LoggingPropertiesProperty] = None,
    snapshotCopyGrantName: Option[String] = None,
    hsmClientCertificateIdentifier: Option[String] = None,
    numberOfNodes: Option[Number] = None,
    revisionTarget: Option[String] = None,
    snapshotClusterIdentifier: Option[String] = None,
    vpcSecurityGroupIds: Option[List[String]] = None,
    snapshotCopyManual: Option[Boolean] = None,
    maintenanceTrackName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    clusterSubnetGroupName: Option[String] = None,
    aquaConfigurationStatus: Option[String] = None,
    destinationRegion: Option[String] = None,
    elasticIp: Option[String] = None,
    clusterVersion: Option[String] = None,
    availabilityZoneRelocation: Option[Boolean] = None,
    ownerAccount: Option[String] = None,
    allowVersionUpgrade: Option[Boolean] = None,
    publiclyAccessible: Option[Boolean] = None,
    hsmConfigurationIdentifier: Option[String] = None,
    deferMaintenanceEndTime: Option[String] = None,
    deferMaintenanceDuration: Option[Number] = None,
    manualSnapshotRetentionPeriod: Option[Number] = None,
    iamRoles: Option[List[String]] = None,
    resourceAction: Option[String] = None,
    availabilityZoneRelocationStatus: Option[String] = None,
    clusterSecurityGroups: Option[List[String]] = None,
    deferMaintenance: Option[Boolean] = None
  ): software.amazon.awscdk.services.redshift.CfnClusterProps =
    (new software.amazon.awscdk.services.redshift.CfnClusterProps.Builder)
      .dbName(dbName)
      .masterUserPassword(masterUserPassword)
      .nodeType(nodeType)
      .clusterType(clusterType)
      .masterUsername(masterUsername)
      .snapshotIdentifier(snapshotIdentifier.orNull)
      .enhancedVpcRouting(enhancedVpcRouting.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .clusterIdentifier(clusterIdentifier.orNull)
      .availabilityZone(availabilityZone.orNull)
      .classic(classic.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .preferredMaintenanceWindow(preferredMaintenanceWindow.orNull)
      .clusterParameterGroupName(clusterParameterGroupName.orNull)
      .automatedSnapshotRetentionPeriod(automatedSnapshotRetentionPeriod.orNull)
      .encrypted(encrypted.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .port(port.orNull)
      .deferMaintenanceStartTime(deferMaintenanceStartTime.orNull)
      .snapshotCopyRetentionPeriod(snapshotCopyRetentionPeriod.orNull)
      .rotateEncryptionKey(rotateEncryptionKey.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .kmsKeyId(kmsKeyId.orNull)
      .loggingProperties(loggingProperties.orNull)
      .snapshotCopyGrantName(snapshotCopyGrantName.orNull)
      .hsmClientCertificateIdentifier(hsmClientCertificateIdentifier.orNull)
      .numberOfNodes(numberOfNodes.orNull)
      .revisionTarget(revisionTarget.orNull)
      .snapshotClusterIdentifier(snapshotClusterIdentifier.orNull)
      .vpcSecurityGroupIds(vpcSecurityGroupIds.map(_.asJava).orNull)
      .snapshotCopyManual(snapshotCopyManual.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .maintenanceTrackName(maintenanceTrackName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .clusterSubnetGroupName(clusterSubnetGroupName.orNull)
      .aquaConfigurationStatus(aquaConfigurationStatus.orNull)
      .destinationRegion(destinationRegion.orNull)
      .elasticIp(elasticIp.orNull)
      .clusterVersion(clusterVersion.orNull)
      .availabilityZoneRelocation(availabilityZoneRelocation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .ownerAccount(ownerAccount.orNull)
      .allowVersionUpgrade(allowVersionUpgrade.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .publiclyAccessible(publiclyAccessible.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .hsmConfigurationIdentifier(hsmConfigurationIdentifier.orNull)
      .deferMaintenanceEndTime(deferMaintenanceEndTime.orNull)
      .deferMaintenanceDuration(deferMaintenanceDuration.orNull)
      .manualSnapshotRetentionPeriod(manualSnapshotRetentionPeriod.orNull)
      .iamRoles(iamRoles.map(_.asJava).orNull)
      .resourceAction(resourceAction.orNull)
      .availabilityZoneRelocationStatus(availabilityZoneRelocationStatus.orNull)
      .clusterSecurityGroups(clusterSecurityGroups.map(_.asJava).orNull)
      .deferMaintenance(deferMaintenance.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
