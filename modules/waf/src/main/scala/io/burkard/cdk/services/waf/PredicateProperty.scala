package io.burkard.cdk.services.waf

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PredicateProperty {

  def apply(
    dataId: String,
    `type`: String,
    negated: Boolean
  ): software.amazon.awscdk.services.waf.regional.CfnRule.PredicateProperty =
    (new software.amazon.awscdk.services.waf.regional.CfnRule.PredicateProperty.Builder)
      .dataId(dataId)
      .`type`(`type`)
      .negated(negated)
      .build()
}
