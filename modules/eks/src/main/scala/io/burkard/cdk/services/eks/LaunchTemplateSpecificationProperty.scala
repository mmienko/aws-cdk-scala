package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LaunchTemplateSpecificationProperty {

  def apply(
    name: Option[String] = None,
    version: Option[String] = None,
    id: Option[String] = None
  ): software.amazon.awscdk.services.eks.CfnNodegroup.LaunchTemplateSpecificationProperty =
    (new software.amazon.awscdk.services.eks.CfnNodegroup.LaunchTemplateSpecificationProperty.Builder)
      .name(name.orNull)
      .version(version.orNull)
      .id(id.orNull)
      .build()
}
