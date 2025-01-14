package io.burkard.cdk.services.ssmincidents

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SsmAutomationProperty {

  def apply(
    documentName: String,
    roleArn: String,
    documentVersion: Option[String] = None,
    parameters: Option[List[_]] = None,
    targetAccount: Option[String] = None
  ): software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.SsmAutomationProperty =
    (new software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.SsmAutomationProperty.Builder)
      .documentName(documentName)
      .roleArn(roleArn)
      .documentVersion(documentVersion.orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .targetAccount(targetAccount.orNull)
      .build()
}
