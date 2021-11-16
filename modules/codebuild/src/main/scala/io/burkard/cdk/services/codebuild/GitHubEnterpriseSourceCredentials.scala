package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GitHubEnterpriseSourceCredentials {

  def apply(
    internalResourceId: String,
    accessToken: software.amazon.awscdk.SecretValue
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentials =
    software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentials.Builder
      .create(stackCtx, internalResourceId)
      .accessToken(accessToken)
      .build()
}
