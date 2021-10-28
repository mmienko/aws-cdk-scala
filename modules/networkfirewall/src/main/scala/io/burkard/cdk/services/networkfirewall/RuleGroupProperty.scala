package io.burkard.cdk.services.networkfirewall

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RuleGroupProperty {

  def apply(
    rulesSource: Option[software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceProperty] = None,
    ruleVariables: Option[software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleVariablesProperty] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleGroupProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleGroupProperty.Builder)
      .rulesSource(rulesSource.orNull)
      .ruleVariables(ruleVariables.orNull)
      .build()
}