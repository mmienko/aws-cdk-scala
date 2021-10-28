package io.burkard.cdk.services.mwaa

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnEnvironment {

  def apply(
    internalResourceId: String,
    pluginsS3Path: Option[String] = None,
    name: Option[String] = None,
    weeklyMaintenanceWindowStart: Option[String] = None,
    pluginsS3ObjectVersion: Option[String] = None,
    airflowConfigurationOptions: Option[AnyRef] = None,
    requirementsS3Path: Option[String] = None,
    environmentClass: Option[String] = None,
    executionRoleArn: Option[String] = None,
    dagS3Path: Option[String] = None,
    kmsKey: Option[String] = None,
    loggingConfiguration: Option[software.amazon.awscdk.services.mwaa.CfnEnvironment.LoggingConfigurationProperty] = None,
    minWorkers: Option[Number] = None,
    sourceBucketArn: Option[String] = None,
    networkConfiguration: Option[software.amazon.awscdk.services.mwaa.CfnEnvironment.NetworkConfigurationProperty] = None,
    maxWorkers: Option[Number] = None,
    tags: Option[software.amazon.awscdk.services.mwaa.CfnEnvironment.TagMapProperty] = None,
    requirementsS3ObjectVersion: Option[String] = None,
    airflowVersion: Option[String] = None,
    webserverAccessMode: Option[String] = None,
    schedulers: Option[Number] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.mwaa.CfnEnvironment =
    software.amazon.awscdk.services.mwaa.CfnEnvironment.Builder
      .create(stackCtx, internalResourceId)
      .pluginsS3Path(pluginsS3Path.orNull)
      .name(name.orNull)
      .weeklyMaintenanceWindowStart(weeklyMaintenanceWindowStart.orNull)
      .pluginsS3ObjectVersion(pluginsS3ObjectVersion.orNull)
      .airflowConfigurationOptions(airflowConfigurationOptions.orNull)
      .requirementsS3Path(requirementsS3Path.orNull)
      .environmentClass(environmentClass.orNull)
      .executionRoleArn(executionRoleArn.orNull)
      .dagS3Path(dagS3Path.orNull)
      .kmsKey(kmsKey.orNull)
      .loggingConfiguration(loggingConfiguration.orNull)
      .minWorkers(minWorkers.orNull)
      .sourceBucketArn(sourceBucketArn.orNull)
      .networkConfiguration(networkConfiguration.orNull)
      .maxWorkers(maxWorkers.orNull)
      .tags(tags.orNull)
      .requirementsS3ObjectVersion(requirementsS3ObjectVersion.orNull)
      .airflowVersion(airflowVersion.orNull)
      .webserverAccessMode(webserverAccessMode.orNull)
      .schedulers(schedulers.orNull)
      .build()
}