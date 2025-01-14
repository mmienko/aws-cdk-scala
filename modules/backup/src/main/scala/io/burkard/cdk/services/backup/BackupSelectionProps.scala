package io.burkard.cdk.services.backup

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BackupSelectionProps {

  def apply(
    backupPlan: software.amazon.awscdk.services.backup.IBackupPlan,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    allowRestores: Option[Boolean] = None,
    resources: Option[List[_ <: software.amazon.awscdk.services.backup.BackupResource]] = None,
    backupSelectionName: Option[String] = None
  ): software.amazon.awscdk.services.backup.BackupSelectionProps =
    (new software.amazon.awscdk.services.backup.BackupSelectionProps.Builder)
      .backupPlan(backupPlan)
      .role(role.orNull)
      .allowRestores(allowRestores.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .resources(resources.map(_.asJava).orNull)
      .backupSelectionName(backupSelectionName.orNull)
      .build()
}
