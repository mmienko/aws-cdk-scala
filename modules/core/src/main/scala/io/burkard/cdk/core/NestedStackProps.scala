package io.burkard.cdk.core

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NestedStackProps {

  def apply(
    notificationArns: Option[List[String]] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    parameters: Option[Map[String, String]] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  ): software.amazon.awscdk.NestedStackProps =
    (new software.amazon.awscdk.NestedStackProps.Builder)
      .notificationArns(notificationArns.map(_.asJava).orNull)
      .timeout(timeout.orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .removalPolicy(removalPolicy.orNull)
      .build()
}