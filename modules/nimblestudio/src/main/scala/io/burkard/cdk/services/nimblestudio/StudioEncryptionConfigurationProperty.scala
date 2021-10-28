package io.burkard.cdk.services.nimblestudio

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StudioEncryptionConfigurationProperty {

  def apply(
    keyType: Option[String] = None,
    keyArn: Option[String] = None
  ): software.amazon.awscdk.services.nimblestudio.CfnStudio.StudioEncryptionConfigurationProperty =
    (new software.amazon.awscdk.services.nimblestudio.CfnStudio.StudioEncryptionConfigurationProperty.Builder)
      .keyType(keyType.orNull)
      .keyArn(keyArn.orNull)
      .build()
}