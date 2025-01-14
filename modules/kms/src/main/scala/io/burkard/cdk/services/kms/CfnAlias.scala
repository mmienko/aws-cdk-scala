package io.burkard.cdk.services.kms

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAlias {

  def apply(
    internalResourceId: String,
    targetKeyId: String,
    aliasName: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.kms.CfnAlias =
    software.amazon.awscdk.services.kms.CfnAlias.Builder
      .create(stackCtx, internalResourceId)
      .targetKeyId(targetKeyId)
      .aliasName(aliasName)
      .build()
}
