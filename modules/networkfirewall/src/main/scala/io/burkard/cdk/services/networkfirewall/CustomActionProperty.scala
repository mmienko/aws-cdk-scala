package io.burkard.cdk.services.networkfirewall

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomActionProperty {

  def apply(
    actionDefinition: software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.ActionDefinitionProperty,
    actionName: String
  ): software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.CustomActionProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.CustomActionProperty.Builder)
      .actionDefinition(actionDefinition)
      .actionName(actionName)
      .build()
}
