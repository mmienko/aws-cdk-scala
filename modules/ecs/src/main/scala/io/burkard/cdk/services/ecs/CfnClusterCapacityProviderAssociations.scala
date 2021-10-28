package io.burkard.cdk.services.ecs

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnClusterCapacityProviderAssociations {

  def apply(
    internalResourceId: String,
    capacityProviders: Option[List[String]] = None,
    cluster: Option[String] = None,
    defaultCapacityProviderStrategy: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations =
    software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations.Builder
      .create(stackCtx, internalResourceId)
      .capacityProviders(capacityProviders.map(_.asJava).orNull)
      .cluster(cluster.orNull)
      .defaultCapacityProviderStrategy(defaultCapacityProviderStrategy.map(_.asJava).orNull)
      .build()
}