package io.burkard.cdk.services.ses

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ReceiptRuleProps {

  def apply(
    ruleSet: software.amazon.awscdk.services.ses.IReceiptRuleSet,
    receiptRuleName: Option[String] = None,
    scanEnabled: Option[Boolean] = None,
    recipients: Option[List[String]] = None,
    enabled: Option[Boolean] = None,
    after: Option[software.amazon.awscdk.services.ses.IReceiptRule] = None,
    tlsPolicy: Option[software.amazon.awscdk.services.ses.TlsPolicy] = None,
    actions: Option[List[_ <: software.amazon.awscdk.services.ses.IReceiptRuleAction]] = None
  ): software.amazon.awscdk.services.ses.ReceiptRuleProps =
    (new software.amazon.awscdk.services.ses.ReceiptRuleProps.Builder)
      .ruleSet(ruleSet)
      .receiptRuleName(receiptRuleName.orNull)
      .scanEnabled(scanEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .recipients(recipients.map(_.asJava).orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .after(after.orNull)
      .tlsPolicy(tlsPolicy.orNull)
      .actions(actions.map(_.asJava).orNull)
      .build()
}
