package io.burkard.cdk.services.opensearchservice

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MasterUserOptionsProperty {

  def apply(
    masterUserArn: Option[String] = None,
    masterUserName: Option[String] = None,
    masterUserPassword: Option[String] = None
  ): software.amazon.awscdk.services.opensearchservice.CfnDomain.MasterUserOptionsProperty =
    (new software.amazon.awscdk.services.opensearchservice.CfnDomain.MasterUserOptionsProperty.Builder)
      .masterUserArn(masterUserArn.orNull)
      .masterUserName(masterUserName.orNull)
      .masterUserPassword(masterUserPassword.orNull)
      .build()
}
