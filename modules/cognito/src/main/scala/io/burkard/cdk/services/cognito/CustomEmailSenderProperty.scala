package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomEmailSenderProperty {

  def apply(
    lambdaArn: Option[String] = None,
    lambdaVersion: Option[String] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPool.CustomEmailSenderProperty =
    (new software.amazon.awscdk.services.cognito.CfnUserPool.CustomEmailSenderProperty.Builder)
      .lambdaArn(lambdaArn.orNull)
      .lambdaVersion(lambdaVersion.orNull)
      .build()
}
