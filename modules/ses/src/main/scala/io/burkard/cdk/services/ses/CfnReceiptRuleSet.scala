package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnReceiptRuleSet {

  def apply(
    internalResourceId: String,
    ruleSetName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ses.CfnReceiptRuleSet =
    software.amazon.awscdk.services.ses.CfnReceiptRuleSet.Builder
      .create(stackCtx, internalResourceId)
      .ruleSetName(ruleSetName.orNull)
      .build()
}