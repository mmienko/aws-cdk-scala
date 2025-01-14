package io.burkard.cdk.services.codestar

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnGitHubRepository {

  def apply(
    internalResourceId: String,
    repositoryName: String,
    repositoryOwner: String,
    repositoryAccessToken: Option[String] = None,
    connectionArn: Option[String] = None,
    repositoryDescription: Option[String] = None,
    code: Option[software.amazon.awscdk.services.codestar.CfnGitHubRepository.CodeProperty] = None,
    isPrivate: Option[Boolean] = None,
    enableIssues: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codestar.CfnGitHubRepository =
    software.amazon.awscdk.services.codestar.CfnGitHubRepository.Builder
      .create(stackCtx, internalResourceId)
      .repositoryName(repositoryName)
      .repositoryOwner(repositoryOwner)
      .repositoryAccessToken(repositoryAccessToken.orNull)
      .connectionArn(connectionArn.orNull)
      .repositoryDescription(repositoryDescription.orNull)
      .code(code.orNull)
      .isPrivate(isPrivate.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .enableIssues(enableIssues.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
