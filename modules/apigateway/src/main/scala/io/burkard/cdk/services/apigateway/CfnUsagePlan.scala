package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUsagePlan {

  def apply(
    internalResourceId: String,
    quota: Option[software.amazon.awscdk.services.apigateway.CfnUsagePlan.QuotaSettingsProperty] = None,
    usagePlanName: Option[String] = None,
    apiStages: Option[List[_]] = None,
    throttle: Option[software.amazon.awscdk.services.apigateway.CfnUsagePlan.ThrottleSettingsProperty] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CfnUsagePlan =
    software.amazon.awscdk.services.apigateway.CfnUsagePlan.Builder
      .create(stackCtx, internalResourceId)
      .quota(quota.orNull)
      .usagePlanName(usagePlanName.orNull)
      .apiStages(apiStages.map(_.asJava).orNull)
      .throttle(throttle.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
