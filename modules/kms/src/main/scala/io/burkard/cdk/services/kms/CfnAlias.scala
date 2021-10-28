package io.burkard.cdk.services.kms

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAlias {

  def apply(
    internalResourceId: String,
    targetKeyId: Option[String] = None,
    aliasName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.kms.CfnAlias =
    software.amazon.awscdk.services.kms.CfnAlias.Builder
      .create(stackCtx, internalResourceId)
      .targetKeyId(targetKeyId.orNull)
      .aliasName(aliasName.orNull)
      .build()
}