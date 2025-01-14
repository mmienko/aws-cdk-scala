package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VersioningConfigurationProperty {

  def apply(
    maxVersions: Option[Number] = None,
    unlimited: Option[Boolean] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDataset.VersioningConfigurationProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDataset.VersioningConfigurationProperty.Builder)
      .maxVersions(maxVersions.orNull)
      .unlimited(unlimited.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
