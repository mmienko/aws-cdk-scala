package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OptionConfiguration {

  def apply(
    name: String,
    version: Option[String] = None,
    port: Option[Number] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    settings: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.rds.OptionConfiguration =
    (new software.amazon.awscdk.services.rds.OptionConfiguration.Builder)
      .name(name)
      .version(version.orNull)
      .port(port.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .vpc(vpc.orNull)
      .settings(settings.map(_.asJava).orNull)
      .build()
}
