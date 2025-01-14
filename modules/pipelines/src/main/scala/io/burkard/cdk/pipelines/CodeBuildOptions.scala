package io.burkard.cdk.pipelines

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CodeBuildOptions {

  def apply(
    rolePolicy: Option[List[_ <: software.amazon.awscdk.services.iam.PolicyStatement]] = None,
    subnetSelection: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    buildEnvironment: Option[software.amazon.awscdk.services.codebuild.BuildEnvironment] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    partialBuildSpec: Option[software.amazon.awscdk.services.codebuild.BuildSpec] = None
  ): software.amazon.awscdk.pipelines.CodeBuildOptions =
    (new software.amazon.awscdk.pipelines.CodeBuildOptions.Builder)
      .rolePolicy(rolePolicy.map(_.asJava).orNull)
      .subnetSelection(subnetSelection.orNull)
      .buildEnvironment(buildEnvironment.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .vpc(vpc.orNull)
      .partialBuildSpec(partialBuildSpec.orNull)
      .build()
}
