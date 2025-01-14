package io.burkard.cdk.services.glue

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDevEndpoint {

  def apply(
    internalResourceId: String,
    roleArn: String,
    tags: Option[AnyRef] = None,
    securityGroupIds: Option[List[String]] = None,
    publicKeys: Option[List[String]] = None,
    securityConfiguration: Option[String] = None,
    publicKey: Option[String] = None,
    endpointName: Option[String] = None,
    glueVersion: Option[String] = None,
    arguments: Option[AnyRef] = None,
    numberOfWorkers: Option[Number] = None,
    numberOfNodes: Option[Number] = None,
    extraJarsS3Path: Option[String] = None,
    subnetId: Option[String] = None,
    extraPythonLibsS3Path: Option[String] = None,
    workerType: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.glue.CfnDevEndpoint =
    software.amazon.awscdk.services.glue.CfnDevEndpoint.Builder
      .create(stackCtx, internalResourceId)
      .roleArn(roleArn)
      .tags(tags.orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .publicKeys(publicKeys.map(_.asJava).orNull)
      .securityConfiguration(securityConfiguration.orNull)
      .publicKey(publicKey.orNull)
      .endpointName(endpointName.orNull)
      .glueVersion(glueVersion.orNull)
      .arguments(arguments.orNull)
      .numberOfWorkers(numberOfWorkers.orNull)
      .numberOfNodes(numberOfNodes.orNull)
      .extraJarsS3Path(extraJarsS3Path.orNull)
      .subnetId(subnetId.orNull)
      .extraPythonLibsS3Path(extraPythonLibsS3Path.orNull)
      .workerType(workerType.orNull)
      .build()
}
