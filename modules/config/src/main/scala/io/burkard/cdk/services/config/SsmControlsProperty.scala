package io.burkard.cdk.services.config

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SsmControlsProperty {

  def apply(
    errorPercentage: Option[Number] = None,
    concurrentExecutionRatePercentage: Option[Number] = None
  ): software.amazon.awscdk.services.config.CfnRemediationConfiguration.SsmControlsProperty =
    (new software.amazon.awscdk.services.config.CfnRemediationConfiguration.SsmControlsProperty.Builder)
      .errorPercentage(errorPercentage.orNull)
      .concurrentExecutionRatePercentage(concurrentExecutionRatePercentage.orNull)
      .build()
}
