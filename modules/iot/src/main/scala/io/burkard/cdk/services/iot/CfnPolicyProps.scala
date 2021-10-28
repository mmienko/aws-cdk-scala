package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPolicyProps {

  def apply(
    policyName: Option[String] = None,
    policyDocument: Option[AnyRef] = None
  ): software.amazon.awscdk.services.iot.CfnPolicyProps =
    (new software.amazon.awscdk.services.iot.CfnPolicyProps.Builder)
      .policyName(policyName.orNull)
      .policyDocument(policyDocument.orNull)
      .build()
}