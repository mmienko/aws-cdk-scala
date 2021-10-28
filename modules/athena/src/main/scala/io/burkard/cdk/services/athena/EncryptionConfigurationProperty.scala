package io.burkard.cdk.services.athena

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EncryptionConfigurationProperty {

  def apply(
    kmsKey: Option[String] = None,
    encryptionOption: Option[String] = None
  ): software.amazon.awscdk.services.athena.CfnWorkGroup.EncryptionConfigurationProperty =
    (new software.amazon.awscdk.services.athena.CfnWorkGroup.EncryptionConfigurationProperty.Builder)
      .kmsKey(kmsKey.orNull)
      .encryptionOption(encryptionOption.orNull)
      .build()
}