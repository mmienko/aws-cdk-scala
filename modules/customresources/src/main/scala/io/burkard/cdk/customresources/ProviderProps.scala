package io.burkard.cdk.customresources

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ProviderProps {

  def apply(
    onEventHandler: software.amazon.awscdk.services.lambda.IFunction,
    logRetention: Option[software.amazon.awscdk.services.logs.RetentionDays] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    totalTimeout: Option[software.amazon.awscdk.Duration] = None,
    queryInterval: Option[software.amazon.awscdk.Duration] = None,
    isCompleteHandler: Option[software.amazon.awscdk.services.lambda.IFunction] = None
  ): software.amazon.awscdk.customresources.ProviderProps =
    (new software.amazon.awscdk.customresources.ProviderProps.Builder)
      .onEventHandler(onEventHandler)
      .logRetention(logRetention.orNull)
      .role(role.orNull)
      .vpcSubnets(vpcSubnets.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .vpc(vpc.orNull)
      .totalTimeout(totalTimeout.orNull)
      .queryInterval(queryInterval.orNull)
      .isCompleteHandler(isCompleteHandler.orNull)
      .build()
}
