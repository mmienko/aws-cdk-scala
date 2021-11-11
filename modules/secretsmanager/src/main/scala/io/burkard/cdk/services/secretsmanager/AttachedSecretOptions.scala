package io.burkard.cdk.services.secretsmanager

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AttachedSecretOptions {

  def apply(
    target: Option[software.amazon.awscdk.services.secretsmanager.ISecretAttachmentTarget] = None
  ): software.amazon.awscdk.services.secretsmanager.AttachedSecretOptions =
    (new software.amazon.awscdk.services.secretsmanager.AttachedSecretOptions.Builder)
      .target(target.orNull)
      .build()
}
