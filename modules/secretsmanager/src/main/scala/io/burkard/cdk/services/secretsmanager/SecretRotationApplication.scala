package io.burkard.cdk.services.secretsmanager

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SecretRotationApplication {

  def apply(
    applicationId: String,
    semanticVersion: String,
    isMultiUser: Option[Boolean] = None
  ): software.amazon.awscdk.services.secretsmanager.SecretRotationApplication =
    software.amazon.awscdk.services.secretsmanager.SecretRotationApplication.Builder
      .create(applicationId, semanticVersion)
      .isMultiUser(isMultiUser.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}