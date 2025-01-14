package io.burkard.cdk.services.glue

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PredicateProperty {

  def apply(
    conditions: Option[List[_]] = None,
    logical: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnTrigger.PredicateProperty =
    (new software.amazon.awscdk.services.glue.CfnTrigger.PredicateProperty.Builder)
      .conditions(conditions.map(_.asJava).orNull)
      .logical(logical.orNull)
      .build()
}
