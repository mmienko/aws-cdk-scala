package io.burkard.cdk.services.managedblockchain

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApprovalThresholdPolicyProperty {

  def apply(
    thresholdPercentage: Option[Number] = None,
    proposalDurationInHours: Option[Number] = None,
    thresholdComparator: Option[String] = None
  ): software.amazon.awscdk.services.managedblockchain.CfnMember.ApprovalThresholdPolicyProperty =
    (new software.amazon.awscdk.services.managedblockchain.CfnMember.ApprovalThresholdPolicyProperty.Builder)
      .thresholdPercentage(thresholdPercentage.orNull)
      .proposalDurationInHours(proposalDurationInHours.orNull)
      .thresholdComparator(thresholdComparator.orNull)
      .build()
}
