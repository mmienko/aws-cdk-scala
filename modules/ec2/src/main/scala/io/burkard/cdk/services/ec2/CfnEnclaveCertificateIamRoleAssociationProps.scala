package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnEnclaveCertificateIamRoleAssociationProps {

  def apply(
    certificateArn: Option[String] = None,
    roleArn: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociationProps =
    (new software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociationProps.Builder)
      .certificateArn(certificateArn.orNull)
      .roleArn(roleArn.orNull)
      .build()
}