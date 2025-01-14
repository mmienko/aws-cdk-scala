package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomerManagedS3StorageProperty {

  def apply(
    bucket: String,
    keyPrefix: Option[String] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDatastore.CustomerManagedS3StorageProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDatastore.CustomerManagedS3StorageProperty.Builder)
      .bucket(bucket)
      .keyPrefix(keyPrefix.orNull)
      .build()
}
