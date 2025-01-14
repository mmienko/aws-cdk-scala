package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnClusterProps {

  def apply(
    capacityProviders: Option[List[String]] = None,
    clusterSettings: Option[List[_]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    defaultCapacityProviderStrategy: Option[List[_]] = None,
    configuration: Option[software.amazon.awscdk.services.ecs.CfnCluster.ClusterConfigurationProperty] = None,
    clusterName: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnClusterProps =
    (new software.amazon.awscdk.services.ecs.CfnClusterProps.Builder)
      .capacityProviders(capacityProviders.map(_.asJava).orNull)
      .clusterSettings(clusterSettings.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .defaultCapacityProviderStrategy(defaultCapacityProviderStrategy.map(_.asJava).orNull)
      .configuration(configuration.orNull)
      .clusterName(clusterName.orNull)
      .build()
}
