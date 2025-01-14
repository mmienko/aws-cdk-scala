package io.burkard.cdk.services.kendra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OneDriveConfigurationProperty {

  def apply(
    secretArn: String,
    tenantDomain: String,
    oneDriveUsers: software.amazon.awscdk.services.kendra.CfnDataSource.OneDriveUsersProperty,
    disableLocalGroups: Option[Boolean] = None,
    fieldMappings: Option[List[_]] = None,
    exclusionPatterns: Option[List[String]] = None,
    inclusionPatterns: Option[List[String]] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.OneDriveConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.OneDriveConfigurationProperty.Builder)
      .secretArn(secretArn)
      .tenantDomain(tenantDomain)
      .oneDriveUsers(oneDriveUsers)
      .disableLocalGroups(disableLocalGroups.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .fieldMappings(fieldMappings.map(_.asJava).orNull)
      .exclusionPatterns(exclusionPatterns.map(_.asJava).orNull)
      .inclusionPatterns(inclusionPatterns.map(_.asJava).orNull)
      .build()
}
