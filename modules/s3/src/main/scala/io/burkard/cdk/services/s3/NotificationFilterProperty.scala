package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NotificationFilterProperty {

  def apply(
    s3Key: software.amazon.awscdk.services.s3.CfnBucket.S3KeyFilterProperty
  ): software.amazon.awscdk.services.s3.CfnBucket.NotificationFilterProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.NotificationFilterProperty.Builder)
      .s3Key(s3Key)
      .build()
}
