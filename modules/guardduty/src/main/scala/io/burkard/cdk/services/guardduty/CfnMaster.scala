package io.burkard.cdk.services.guardduty

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMaster {

  def apply(
    internalResourceId: String,
    detectorId: String,
    masterId: String,
    invitationId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.guardduty.CfnMaster =
    software.amazon.awscdk.services.guardduty.CfnMaster.Builder
      .create(stackCtx, internalResourceId)
      .detectorId(detectorId)
      .masterId(masterId)
      .invitationId(invitationId.orNull)
      .build()
}
