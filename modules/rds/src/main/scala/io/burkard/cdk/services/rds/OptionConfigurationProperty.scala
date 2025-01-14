package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OptionConfigurationProperty {

  def apply(
    optionName: String,
    vpcSecurityGroupMemberships: Option[List[String]] = None,
    port: Option[Number] = None,
    optionSettings: Option[List[_]] = None,
    dbSecurityGroupMemberships: Option[List[String]] = None,
    optionVersion: Option[String] = None
  ): software.amazon.awscdk.services.rds.CfnOptionGroup.OptionConfigurationProperty =
    (new software.amazon.awscdk.services.rds.CfnOptionGroup.OptionConfigurationProperty.Builder)
      .optionName(optionName)
      .vpcSecurityGroupMemberships(vpcSecurityGroupMemberships.map(_.asJava).orNull)
      .port(port.orNull)
      .optionSettings(optionSettings.map(_.asJava).orNull)
      .dbSecurityGroupMemberships(dbSecurityGroupMemberships.map(_.asJava).orNull)
      .optionVersion(optionVersion.orNull)
      .build()
}
