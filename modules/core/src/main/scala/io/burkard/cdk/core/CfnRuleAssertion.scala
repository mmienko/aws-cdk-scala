package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRuleAssertion {

  def apply(
    assertDescription: Option[String] = None,
    assertValue: Option[software.amazon.awscdk.ICfnConditionExpression] = None
  ): software.amazon.awscdk.CfnRuleAssertion =
    (new software.amazon.awscdk.CfnRuleAssertion.Builder)
      .assertDescription(assertDescription.orNull)
      .assertValue(assertValue.orNull)
      .build()
}