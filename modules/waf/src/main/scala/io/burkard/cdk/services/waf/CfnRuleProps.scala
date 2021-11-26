package io.burkard.cdk.services.waf

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRuleProps {

  def apply(
    metricName: String,
    name: String,
    predicates: Option[List[_]] = None
  ): software.amazon.awscdk.services.waf.CfnRuleProps =
    (new software.amazon.awscdk.services.waf.CfnRuleProps.Builder)
      .metricName(metricName)
      .name(name)
      .predicates(predicates.map(_.asJava).orNull)
      .build()
}
