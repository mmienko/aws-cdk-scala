package io.burkard.cdk.services.codedeploy

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ServerDeploymentGroup {

  def apply(
    internalResourceId: String,
    application: Option[software.amazon.awscdk.services.codedeploy.IServerApplication] = None,
    ec2InstanceTags: Option[software.amazon.awscdk.services.codedeploy.InstanceTagSet] = None,
    ignorePollAlarmsFailure: Option[Boolean] = None,
    onPremiseInstanceTags: Option[software.amazon.awscdk.services.codedeploy.InstanceTagSet] = None,
    deploymentConfig: Option[software.amazon.awscdk.services.codedeploy.IServerDeploymentConfig] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    autoScalingGroups: Option[List[_ <: software.amazon.awscdk.services.autoscaling.IAutoScalingGroup]] = None,
    autoRollback: Option[software.amazon.awscdk.services.codedeploy.AutoRollbackConfig] = None,
    installAgent: Option[Boolean] = None,
    alarms: Option[List[_ <: software.amazon.awscdk.services.cloudwatch.IAlarm]] = None,
    deploymentGroupName: Option[String] = None,
    loadBalancer: Option[software.amazon.awscdk.services.codedeploy.LoadBalancer] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codedeploy.ServerDeploymentGroup =
    software.amazon.awscdk.services.codedeploy.ServerDeploymentGroup.Builder
      .create(stackCtx, internalResourceId)
      .application(application.orNull)
      .ec2InstanceTags(ec2InstanceTags.orNull)
      .ignorePollAlarmsFailure(ignorePollAlarmsFailure.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .onPremiseInstanceTags(onPremiseInstanceTags.orNull)
      .deploymentConfig(deploymentConfig.orNull)
      .role(role.orNull)
      .autoScalingGroups(autoScalingGroups.map(_.asJava).orNull)
      .autoRollback(autoRollback.orNull)
      .installAgent(installAgent.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .alarms(alarms.map(_.asJava).orNull)
      .deploymentGroupName(deploymentGroupName.orNull)
      .loadBalancer(loadBalancer.orNull)
      .build()
}
