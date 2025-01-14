package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnNetworkInsightsAnalysis {

  def apply(
    internalResourceId: String,
    networkInsightsPathId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    filterInArns: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis =
    software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.Builder
      .create(stackCtx, internalResourceId)
      .networkInsightsPathId(networkInsightsPathId)
      .tags(tags.map(_.asJava).orNull)
      .filterInArns(filterInArns.map(_.asJava).orNull)
      .build()
}
