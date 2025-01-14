package io.burkard.cdk.services.dynamodb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ReplicaSpecificationProperty {

  def apply(
    region: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    sseSpecification: Option[software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaSSESpecificationProperty] = None,
    readProvisionedThroughputSettings: Option[software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReadProvisionedThroughputSettingsProperty] = None,
    globalSecondaryIndexes: Option[List[_]] = None,
    pointInTimeRecoverySpecification: Option[software.amazon.awscdk.services.dynamodb.CfnGlobalTable.PointInTimeRecoverySpecificationProperty] = None,
    contributorInsightsSpecification: Option[software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ContributorInsightsSpecificationProperty] = None
  ): software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaSpecificationProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaSpecificationProperty.Builder)
      .region(region)
      .tags(tags.map(_.asJava).orNull)
      .sseSpecification(sseSpecification.orNull)
      .readProvisionedThroughputSettings(readProvisionedThroughputSettings.orNull)
      .globalSecondaryIndexes(globalSecondaryIndexes.map(_.asJava).orNull)
      .pointInTimeRecoverySpecification(pointInTimeRecoverySpecification.orNull)
      .contributorInsightsSpecification(contributorInsightsSpecification.orNull)
      .build()
}
