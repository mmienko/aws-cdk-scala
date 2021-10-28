package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MultipartUserData {

  def apply(
    partsSeparator: Option[String] = None
  ): software.amazon.awscdk.services.ec2.MultipartUserData =
    software.amazon.awscdk.services.ec2.MultipartUserData.Builder
      .create()
      .partsSeparator(partsSeparator.orNull)
      .build()
}