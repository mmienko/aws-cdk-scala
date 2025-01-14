package io.burkard.cdk.services.dms

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEventSubscriptionProps {

  def apply(
    snsTopicArn: String,
    sourceType: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    enabled: Option[Boolean] = None,
    eventCategories: Option[List[String]] = None,
    sourceIds: Option[List[String]] = None,
    subscriptionName: Option[String] = None
  ): software.amazon.awscdk.services.dms.CfnEventSubscriptionProps =
    (new software.amazon.awscdk.services.dms.CfnEventSubscriptionProps.Builder)
      .snsTopicArn(snsTopicArn)
      .sourceType(sourceType.orNull)
      .tags(tags.map(_.asJava).orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .eventCategories(eventCategories.map(_.asJava).orNull)
      .sourceIds(sourceIds.map(_.asJava).orNull)
      .subscriptionName(subscriptionName.orNull)
      .build()
}
