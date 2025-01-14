package io.burkard.cdk.services.codepipeline

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ManualApprovalAction {

  def apply(
    notificationTopic: Option[software.amazon.awscdk.services.sns.ITopic] = None,
    additionalInformation: Option[String] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    notifyEmails: Option[List[String]] = None,
    variablesNamespace: Option[String] = None,
    runOrder: Option[Number] = None,
    actionName: Option[String] = None,
    externalEntityLink: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.actions.ManualApprovalAction =
    software.amazon.awscdk.services.codepipeline.actions.ManualApprovalAction.Builder
      .create()
      .notificationTopic(notificationTopic.orNull)
      .additionalInformation(additionalInformation.orNull)
      .role(role.orNull)
      .notifyEmails(notifyEmails.map(_.asJava).orNull)
      .variablesNamespace(variablesNamespace.orNull)
      .runOrder(runOrder.orNull)
      .actionName(actionName.orNull)
      .externalEntityLink(externalEntityLink.orNull)
      .build()
}
