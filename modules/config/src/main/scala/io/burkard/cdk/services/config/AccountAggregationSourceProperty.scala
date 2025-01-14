package io.burkard.cdk.services.config

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AccountAggregationSourceProperty {

  def apply(
    accountIds: List[String],
    allAwsRegions: Option[Boolean] = None,
    awsRegions: Option[List[String]] = None
  ): software.amazon.awscdk.services.config.CfnConfigurationAggregator.AccountAggregationSourceProperty =
    (new software.amazon.awscdk.services.config.CfnConfigurationAggregator.AccountAggregationSourceProperty.Builder)
      .accountIds(accountIds.asJava)
      .allAwsRegions(allAwsRegions.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .awsRegions(awsRegions.map(_.asJava).orNull)
      .build()
}
