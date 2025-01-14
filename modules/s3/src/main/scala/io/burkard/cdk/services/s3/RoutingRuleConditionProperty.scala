package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RoutingRuleConditionProperty {

  def apply(
    httpErrorCodeReturnedEquals: Option[String] = None,
    keyPrefixEquals: Option[String] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleConditionProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleConditionProperty.Builder)
      .httpErrorCodeReturnedEquals(httpErrorCodeReturnedEquals.orNull)
      .keyPrefixEquals(keyPrefixEquals.orNull)
      .build()
}
