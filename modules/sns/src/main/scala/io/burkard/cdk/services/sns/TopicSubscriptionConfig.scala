package io.burkard.cdk.services.sns

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TopicSubscriptionConfig {

  def apply(
    subscriberId: String,
    subscriptionRoleArn: Option[String] = None,
    deadLetterQueue: Option[software.amazon.awscdk.services.sqs.IQueue] = None,
    rawMessageDelivery: Option[Boolean] = None,
    subscriberScope: Option[software.constructs.Construct] = None,
    protocol: Option[software.amazon.awscdk.services.sns.SubscriptionProtocol] = None,
    region: Option[String] = None,
    endpoint: Option[String] = None,
    filterPolicy: Option[Map[String, _ <: software.amazon.awscdk.services.sns.SubscriptionFilter]] = None
  ): software.amazon.awscdk.services.sns.TopicSubscriptionConfig =
    (new software.amazon.awscdk.services.sns.TopicSubscriptionConfig.Builder)
      .subscriberId(subscriberId)
      .subscriptionRoleArn(subscriptionRoleArn.orNull)
      .deadLetterQueue(deadLetterQueue.orNull)
      .rawMessageDelivery(rawMessageDelivery.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .subscriberScope(subscriberScope.orNull)
      .protocol(protocol.orNull)
      .region(region.orNull)
      .endpoint(endpoint.orNull)
      .filterPolicy(filterPolicy.map(_.asJava).orNull)
      .build()
}
