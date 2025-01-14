package io.burkard.cdk.services.codepipeline

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ActionDeclarationProperty {

  def apply(
    name: String,
    actionTypeId: software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionTypeIdProperty,
    inputArtifacts: Option[List[_]] = None,
    roleArn: Option[String] = None,
    runOrder: Option[Number] = None,
    region: Option[String] = None,
    namespace: Option[String] = None,
    outputArtifacts: Option[List[_]] = None,
    configuration: Option[AnyRef] = None
  ): software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty =
    (new software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty.Builder)
      .name(name)
      .actionTypeId(actionTypeId)
      .inputArtifacts(inputArtifacts.map(_.asJava).orNull)
      .roleArn(roleArn.orNull)
      .runOrder(runOrder.orNull)
      .region(region.orNull)
      .namespace(namespace.orNull)
      .outputArtifacts(outputArtifacts.map(_.asJava).orNull)
      .configuration(configuration.orNull)
      .build()
}
