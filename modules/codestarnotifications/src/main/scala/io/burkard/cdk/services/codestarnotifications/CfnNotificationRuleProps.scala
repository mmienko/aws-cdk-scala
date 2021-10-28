package io.burkard.cdk.services.codestarnotifications

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnNotificationRuleProps {

  def apply(
    name: Option[String] = None,
    targets: Option[List[_]] = None,
    tags: Option[AnyRef] = None,
    eventTypeIds: Option[List[String]] = None,
    status: Option[String] = None,
    resource: Option[String] = None,
    detailType: Option[String] = None
  ): software.amazon.awscdk.services.codestarnotifications.CfnNotificationRuleProps =
    (new software.amazon.awscdk.services.codestarnotifications.CfnNotificationRuleProps.Builder)
      .name(name.orNull)
      .targets(targets.map(_.asJava).orNull)
      .tags(tags.orNull)
      .eventTypeIds(eventTypeIds.map(_.asJava).orNull)
      .status(status.orNull)
      .resource(resource.orNull)
      .detailType(detailType.orNull)
      .build()
}