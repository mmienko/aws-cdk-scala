package io.burkard.cdk.services.elasticsearch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MasterUserOptionsProperty {

  def apply(
    masterUserArn: Option[String] = None,
    masterUserName: Option[String] = None,
    masterUserPassword: Option[String] = None
  ): software.amazon.awscdk.services.elasticsearch.CfnDomain.MasterUserOptionsProperty =
    (new software.amazon.awscdk.services.elasticsearch.CfnDomain.MasterUserOptionsProperty.Builder)
      .masterUserArn(masterUserArn.orNull)
      .masterUserName(masterUserName.orNull)
      .masterUserPassword(masterUserPassword.orNull)
      .build()
}
