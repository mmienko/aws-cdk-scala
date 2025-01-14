package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SpotPlacementProperty {

  def apply(
    availabilityZone: Option[String] = None,
    groupName: Option[String] = None,
    tenancy: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotPlacementProperty =
    (new software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotPlacementProperty.Builder)
      .availabilityZone(availabilityZone.orNull)
      .groupName(groupName.orNull)
      .tenancy(tenancy.orNull)
      .build()
}
