package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ActionBindOptions {

  def apply(
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    bucket: Option[software.amazon.awscdk.services.s3.IBucket] = None
  ): software.amazon.awscdk.services.codepipeline.ActionBindOptions =
    (new software.amazon.awscdk.services.codepipeline.ActionBindOptions.Builder)
      .role(role.orNull)
      .bucket(bucket.orNull)
      .build()
}