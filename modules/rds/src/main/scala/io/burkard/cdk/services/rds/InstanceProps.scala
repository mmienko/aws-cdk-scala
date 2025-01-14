package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InstanceProps {

  def apply(
    vpc: software.amazon.awscdk.services.ec2.IVpc,
    performanceInsightEncryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    autoMinorVersionUpgrade: Option[Boolean] = None,
    instanceType: Option[software.amazon.awscdk.services.ec2.InstanceType] = None,
    allowMajorVersionUpgrade: Option[Boolean] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    publiclyAccessible: Option[Boolean] = None,
    enablePerformanceInsights: Option[Boolean] = None,
    parameterGroup: Option[software.amazon.awscdk.services.rds.IParameterGroup] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    deleteAutomatedBackups: Option[Boolean] = None,
    performanceInsightRetention: Option[software.amazon.awscdk.services.rds.PerformanceInsightRetention] = None
  ): software.amazon.awscdk.services.rds.InstanceProps =
    (new software.amazon.awscdk.services.rds.InstanceProps.Builder)
      .vpc(vpc)
      .performanceInsightEncryptionKey(performanceInsightEncryptionKey.orNull)
      .autoMinorVersionUpgrade(autoMinorVersionUpgrade.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .instanceType(instanceType.orNull)
      .allowMajorVersionUpgrade(allowMajorVersionUpgrade.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .publiclyAccessible(publiclyAccessible.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .enablePerformanceInsights(enablePerformanceInsights.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .parameterGroup(parameterGroup.orNull)
      .vpcSubnets(vpcSubnets.orNull)
      .deleteAutomatedBackups(deleteAutomatedBackups.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .performanceInsightRetention(performanceInsightRetention.orNull)
      .build()
}
