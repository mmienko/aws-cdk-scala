package io.burkard.cdk.services.codepipeline

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CloudFormationDeleteStackAction {

  def apply(
    adminPermissions: Boolean,
    stackName: String,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    variablesNamespace: Option[String] = None,
    runOrder: Option[Number] = None,
    actionName: Option[String] = None,
    region: Option[String] = None,
    output: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None,
    parameterOverrides: Option[Map[String, _]] = None,
    cfnCapabilities: Option[List[_ <: software.amazon.awscdk.CfnCapabilities]] = None,
    templateConfiguration: Option[software.amazon.awscdk.services.codepipeline.ArtifactPath] = None,
    outputFileName: Option[String] = None,
    extraInputs: Option[List[_ <: software.amazon.awscdk.services.codepipeline.Artifact]] = None,
    account: Option[String] = None,
    deploymentRole: Option[software.amazon.awscdk.services.iam.IRole] = None
  ): software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeleteStackAction =
    software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeleteStackAction.Builder
      .create()
      .adminPermissions(adminPermissions)
      .stackName(stackName)
      .role(role.orNull)
      .variablesNamespace(variablesNamespace.orNull)
      .runOrder(runOrder.orNull)
      .actionName(actionName.orNull)
      .region(region.orNull)
      .output(output.orNull)
      .parameterOverrides(parameterOverrides.map(_.asJava).orNull)
      .cfnCapabilities(cfnCapabilities.map(_.asJava).orNull)
      .templateConfiguration(templateConfiguration.orNull)
      .outputFileName(outputFileName.orNull)
      .extraInputs(extraInputs.map(_.asJava).orNull)
      .account(account.orNull)
      .deploymentRole(deploymentRole.orNull)
      .build()
}
