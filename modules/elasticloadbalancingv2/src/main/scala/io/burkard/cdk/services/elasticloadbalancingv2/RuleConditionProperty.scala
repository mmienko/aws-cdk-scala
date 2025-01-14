package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RuleConditionProperty {

  def apply(
    queryStringConfig: Option[software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.QueryStringConfigProperty] = None,
    field: Option[String] = None,
    sourceIpConfig: Option[software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.SourceIpConfigProperty] = None,
    hostHeaderConfig: Option[software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HostHeaderConfigProperty] = None,
    httpRequestMethodConfig: Option[software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HttpRequestMethodConfigProperty] = None,
    httpHeaderConfig: Option[software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HttpHeaderConfigProperty] = None,
    values: Option[List[String]] = None,
    pathPatternConfig: Option[software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.PathPatternConfigProperty] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.RuleConditionProperty =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.RuleConditionProperty.Builder)
      .queryStringConfig(queryStringConfig.orNull)
      .field(field.orNull)
      .sourceIpConfig(sourceIpConfig.orNull)
      .hostHeaderConfig(hostHeaderConfig.orNull)
      .httpRequestMethodConfig(httpRequestMethodConfig.orNull)
      .httpHeaderConfig(httpHeaderConfig.orNull)
      .values(values.map(_.asJava).orNull)
      .pathPatternConfig(pathPatternConfig.orNull)
      .build()
}
