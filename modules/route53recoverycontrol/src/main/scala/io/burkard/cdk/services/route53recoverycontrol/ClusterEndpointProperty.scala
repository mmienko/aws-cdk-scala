package io.burkard.cdk.services.route53recoverycontrol

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ClusterEndpointProperty {

  def apply(
    region: Option[String] = None,
    endpoint: Option[String] = None
  ): software.amazon.awscdk.services.route53recoverycontrol.CfnCluster.ClusterEndpointProperty =
    (new software.amazon.awscdk.services.route53recoverycontrol.CfnCluster.ClusterEndpointProperty.Builder)
      .region(region.orNull)
      .endpoint(endpoint.orNull)
      .build()
}