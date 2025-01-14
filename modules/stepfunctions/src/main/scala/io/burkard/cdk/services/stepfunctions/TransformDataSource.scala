package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TransformDataSource {

  def apply(
    s3DataSource: software.amazon.awscdk.services.stepfunctions.tasks.TransformS3DataSource
  ): software.amazon.awscdk.services.stepfunctions.tasks.TransformDataSource =
    (new software.amazon.awscdk.services.stepfunctions.tasks.TransformDataSource.Builder)
      .s3DataSource(s3DataSource)
      .build()
}
