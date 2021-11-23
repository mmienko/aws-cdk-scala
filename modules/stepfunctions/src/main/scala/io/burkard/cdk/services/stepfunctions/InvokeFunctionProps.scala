package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InvokeFunctionProps {

  def apply(
    payload: Option[Map[String, _]] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.InvokeFunctionProps =
    (new software.amazon.awscdk.services.stepfunctions.tasks.InvokeFunctionProps.Builder)
      .payload(payload.map(_.asJava).orNull)
      .build()
}