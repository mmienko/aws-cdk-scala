package io.burkard.cdk.services.codestar

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CodeProperty {

  def apply(
    s3: software.amazon.awscdk.services.codestar.CfnGitHubRepository.S3Property
  ): software.amazon.awscdk.services.codestar.CfnGitHubRepository.CodeProperty =
    (new software.amazon.awscdk.services.codestar.CfnGitHubRepository.CodeProperty.Builder)
      .s3(s3)
      .build()
}
