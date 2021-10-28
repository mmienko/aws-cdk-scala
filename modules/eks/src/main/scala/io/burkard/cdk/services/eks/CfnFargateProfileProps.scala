package io.burkard.cdk.services.eks

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnFargateProfileProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    fargateProfileName: Option[String] = None,
    selectors: Option[List[_]] = None,
    clusterName: Option[String] = None,
    podExecutionRoleArn: Option[String] = None,
    subnets: Option[List[String]] = None
  ): software.amazon.awscdk.services.eks.CfnFargateProfileProps =
    (new software.amazon.awscdk.services.eks.CfnFargateProfileProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .fargateProfileName(fargateProfileName.orNull)
      .selectors(selectors.map(_.asJava).orNull)
      .clusterName(clusterName.orNull)
      .podExecutionRoleArn(podExecutionRoleArn.orNull)
      .subnets(subnets.map(_.asJava).orNull)
      .build()
}