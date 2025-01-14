package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StorageLensConfigurationProperty {

  def apply(
    accountLevel: software.amazon.awscdk.services.s3.CfnStorageLens.AccountLevelProperty,
    id: String,
    isEnabled: Boolean,
    dataExport: Option[software.amazon.awscdk.services.s3.CfnStorageLens.DataExportProperty] = None,
    include: Option[software.amazon.awscdk.services.s3.CfnStorageLens.BucketsAndRegionsProperty] = None,
    exclude: Option[software.amazon.awscdk.services.s3.CfnStorageLens.BucketsAndRegionsProperty] = None,
    awsOrg: Option[software.amazon.awscdk.services.s3.CfnStorageLens.AwsOrgProperty] = None,
    storageLensArn: Option[String] = None
  ): software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensConfigurationProperty =
    (new software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensConfigurationProperty.Builder)
      .accountLevel(accountLevel)
      .id(id)
      .isEnabled(isEnabled)
      .dataExport(dataExport.orNull)
      .include(include.orNull)
      .exclude(exclude.orNull)
      .awsOrg(awsOrg.orNull)
      .storageLensArn(storageLensArn.orNull)
      .build()
}
