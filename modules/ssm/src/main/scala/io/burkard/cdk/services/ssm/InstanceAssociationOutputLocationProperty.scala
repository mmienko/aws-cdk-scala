package io.burkard.cdk.services.ssm

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InstanceAssociationOutputLocationProperty {

  def apply(
    s3Location: Option[software.amazon.awscdk.services.ssm.CfnAssociation.S3OutputLocationProperty] = None
  ): software.amazon.awscdk.services.ssm.CfnAssociation.InstanceAssociationOutputLocationProperty =
    (new software.amazon.awscdk.services.ssm.CfnAssociation.InstanceAssociationOutputLocationProperty.Builder)
      .s3Location(s3Location.orNull)
      .build()
}
