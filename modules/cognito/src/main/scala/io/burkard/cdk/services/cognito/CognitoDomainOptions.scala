package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CognitoDomainOptions {

  def apply(
    domainPrefix: String
  ): software.amazon.awscdk.services.cognito.CognitoDomainOptions =
    (new software.amazon.awscdk.services.cognito.CognitoDomainOptions.Builder)
      .domainPrefix(domainPrefix)
      .build()
}
