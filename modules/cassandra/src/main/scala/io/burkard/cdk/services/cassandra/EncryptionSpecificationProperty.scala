package io.burkard.cdk.services.cassandra

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EncryptionSpecificationProperty {

  def apply(
    kmsKeyIdentifier: Option[String] = None,
    encryptionType: Option[String] = None
  ): software.amazon.awscdk.services.cassandra.CfnTable.EncryptionSpecificationProperty =
    (new software.amazon.awscdk.services.cassandra.CfnTable.EncryptionSpecificationProperty.Builder)
      .kmsKeyIdentifier(kmsKeyIdentifier.orNull)
      .encryptionType(encryptionType.orNull)
      .build()
}