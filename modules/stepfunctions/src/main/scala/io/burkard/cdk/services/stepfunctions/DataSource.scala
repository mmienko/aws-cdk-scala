package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DataSource {

  def apply(
    s3DataSource: software.amazon.awscdk.services.stepfunctions.tasks.S3DataSource
  ): software.amazon.awscdk.services.stepfunctions.tasks.DataSource =
    (new software.amazon.awscdk.services.stepfunctions.tasks.DataSource.Builder)
      .s3DataSource(s3DataSource)
      .build()
}
