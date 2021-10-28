package io.burkard.cdk.services.docdb

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDBInstance {

  def apply(
    internalResourceId: String,
    dbInstanceClass: Option[String] = None,
    dbClusterIdentifier: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    availabilityZone: Option[String] = None,
    dbInstanceIdentifier: Option[String] = None,
    preferredMaintenanceWindow: Option[String] = None,
    autoMinorVersionUpgrade: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.docdb.CfnDBInstance =
    software.amazon.awscdk.services.docdb.CfnDBInstance.Builder
      .create(stackCtx, internalResourceId)
      .dbInstanceClass(dbInstanceClass.orNull)
      .dbClusterIdentifier(dbClusterIdentifier.orNull)
      .tags(tags.map(_.asJava).orNull)
      .availabilityZone(availabilityZone.orNull)
      .dbInstanceIdentifier(dbInstanceIdentifier.orNull)
      .preferredMaintenanceWindow(preferredMaintenanceWindow.orNull)
      .autoMinorVersionUpgrade(autoMinorVersionUpgrade.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}