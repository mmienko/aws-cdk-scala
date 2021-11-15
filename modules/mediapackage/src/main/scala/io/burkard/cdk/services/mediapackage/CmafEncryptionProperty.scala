package io.burkard.cdk.services.mediapackage

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CmafEncryptionProperty {

  def apply(
    spekeKeyProvider: Option[software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.SpekeKeyProviderProperty] = None
  ): software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CmafEncryptionProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CmafEncryptionProperty.Builder)
      .spekeKeyProvider(spekeKeyProvider.orNull)
      .build()
}
