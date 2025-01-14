package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApplicationReferenceDataSourceV2 {

  def apply(
    internalResourceId: String,
    referenceDataSource: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty,
    applicationName: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2 =
    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.Builder
      .create(stackCtx, internalResourceId)
      .referenceDataSource(referenceDataSource)
      .applicationName(applicationName)
      .build()
}
