package io.burkard.cdk.services.waf

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRateBasedRule {

  def apply(
    internalResourceId: String,
    name: String,
    rateKey: String,
    metricName: String,
    rateLimit: Number,
    matchPredicates: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.waf.regional.CfnRateBasedRule =
    software.amazon.awscdk.services.waf.regional.CfnRateBasedRule.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .rateKey(rateKey)
      .metricName(metricName)
      .rateLimit(rateLimit)
      .matchPredicates(matchPredicates.map(_.asJava).orNull)
      .build()
}
