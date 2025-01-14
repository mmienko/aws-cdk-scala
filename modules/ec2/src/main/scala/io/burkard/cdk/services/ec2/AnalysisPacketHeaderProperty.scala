package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AnalysisPacketHeaderProperty {

  def apply(
    sourceAddresses: Option[List[String]] = None,
    sourcePortRanges: Option[List[_]] = None,
    protocol: Option[String] = None,
    destinationAddresses: Option[List[String]] = None,
    destinationPortRanges: Option[List[_]] = None
  ): software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisPacketHeaderProperty =
    (new software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisPacketHeaderProperty.Builder)
      .sourceAddresses(sourceAddresses.map(_.asJava).orNull)
      .sourcePortRanges(sourcePortRanges.map(_.asJava).orNull)
      .protocol(protocol.orNull)
      .destinationAddresses(destinationAddresses.map(_.asJava).orNull)
      .destinationPortRanges(destinationPortRanges.map(_.asJava).orNull)
      .build()
}
