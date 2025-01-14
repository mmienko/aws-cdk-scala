package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NestedStack {

  def apply(
    internalResourceId: String,
    notificationArns: Option[List[String]] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    parameters: Option[Map[String, String]] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.NestedStack =
    software.amazon.awscdk.NestedStack.Builder
      .create(stackCtx, internalResourceId)
      .notificationArns(notificationArns.map(_.asJava).orNull)
      .timeout(timeout.orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .removalPolicy(removalPolicy.orNull)
      .build()
}
