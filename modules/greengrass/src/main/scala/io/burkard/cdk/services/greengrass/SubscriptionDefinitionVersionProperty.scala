package io.burkard.cdk.services.greengrass

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SubscriptionDefinitionVersionProperty {

  def apply(
    subscriptions: List[_]
  ): software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionDefinitionVersionProperty =
    (new software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionDefinitionVersionProperty.Builder)
      .subscriptions(subscriptions.asJava)
      .build()
}
