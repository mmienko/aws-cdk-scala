package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3NotificationFilterProperty {

  def apply(
    s3Key: software.amazon.awscdk.services.sam.CfnFunction.S3KeyFilterProperty
  ): software.amazon.awscdk.services.sam.CfnFunction.S3NotificationFilterProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.S3NotificationFilterProperty.Builder)
      .s3Key(s3Key)
      .build()
}
