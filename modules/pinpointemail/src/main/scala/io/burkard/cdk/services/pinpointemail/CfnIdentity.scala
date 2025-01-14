package io.burkard.cdk.services.pinpointemail

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnIdentity {

  def apply(
    internalResourceId: String,
    name: String,
    mailFromAttributes: Option[software.amazon.awscdk.services.pinpointemail.CfnIdentity.MailFromAttributesProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.pinpointemail.CfnIdentity.TagsProperty]] = None,
    feedbackForwardingEnabled: Option[Boolean] = None,
    dkimSigningEnabled: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.pinpointemail.CfnIdentity =
    software.amazon.awscdk.services.pinpointemail.CfnIdentity.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .mailFromAttributes(mailFromAttributes.orNull)
      .tags(tags.map(_.asJava).orNull)
      .feedbackForwardingEnabled(feedbackForwardingEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .dkimSigningEnabled(dkimSigningEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
