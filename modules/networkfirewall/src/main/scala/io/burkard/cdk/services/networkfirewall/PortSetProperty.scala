package io.burkard.cdk.services.networkfirewall

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PortSetProperty {

  def apply(
    definition: Option[List[String]] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PortSetProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PortSetProperty.Builder)
      .definition(definition.map(_.asJava).orNull)
      .build()
}
