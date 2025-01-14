package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object WindowsImage {

  def apply(
    version: software.amazon.awscdk.services.ec2.WindowsVersion,
    userData: Option[software.amazon.awscdk.services.ec2.UserData] = None
  ): software.amazon.awscdk.services.ec2.WindowsImage =
    software.amazon.awscdk.services.ec2.WindowsImage.Builder
      .create(version)
      .userData(userData.orNull)
      .build()
}
