package io.burkard.cdk.services.budgets

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NotificationWithSubscribersProperty {

  def apply(
    subscribers: Option[List[_]] = None,
    notification: Option[software.amazon.awscdk.services.budgets.CfnBudget.NotificationProperty] = None
  ): software.amazon.awscdk.services.budgets.CfnBudget.NotificationWithSubscribersProperty =
    (new software.amazon.awscdk.services.budgets.CfnBudget.NotificationWithSubscribersProperty.Builder)
      .subscribers(subscribers.map(_.asJava).orNull)
      .notification(notification.orNull)
      .build()
}