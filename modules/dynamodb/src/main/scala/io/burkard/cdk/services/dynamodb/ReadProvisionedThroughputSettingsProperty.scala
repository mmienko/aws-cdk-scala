package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ReadProvisionedThroughputSettingsProperty {

  def apply(
    readCapacityAutoScalingSettings: Option[software.amazon.awscdk.services.dynamodb.CfnGlobalTable.CapacityAutoScalingSettingsProperty] = None,
    readCapacityUnits: Option[Number] = None
  ): software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReadProvisionedThroughputSettingsProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReadProvisionedThroughputSettingsProperty.Builder)
      .readCapacityAutoScalingSettings(readCapacityAutoScalingSettings.orNull)
      .readCapacityUnits(readCapacityUnits.orNull)
      .build()
}
