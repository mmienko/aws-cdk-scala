package io.burkard.cdk.services.stepfunctions

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EcsEc2LaunchTarget {

  def apply(
    placementConstraints: Option[List[_ <: software.amazon.awscdk.services.ecs.PlacementConstraint]] = None,
    placementStrategies: Option[List[_ <: software.amazon.awscdk.services.ecs.PlacementStrategy]] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EcsEc2LaunchTarget =
    software.amazon.awscdk.services.stepfunctions.tasks.EcsEc2LaunchTarget.Builder
      .create()
      .placementConstraints(placementConstraints.map(_.asJava).orNull)
      .placementStrategies(placementStrategies.map(_.asJava).orNull)
      .build()
}