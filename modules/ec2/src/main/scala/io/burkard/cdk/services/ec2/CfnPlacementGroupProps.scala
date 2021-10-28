package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPlacementGroupProps {

  def apply(
    strategy: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnPlacementGroupProps =
    (new software.amazon.awscdk.services.ec2.CfnPlacementGroupProps.Builder)
      .strategy(strategy.orNull)
      .build()
}