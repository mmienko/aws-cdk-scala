package io.burkard.cdk.services.opsworks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ChefConfigurationProperty {

  def apply(
    manageBerkshelf: Option[Boolean] = None,
    berkshelfVersion: Option[String] = None
  ): software.amazon.awscdk.services.opsworks.CfnStack.ChefConfigurationProperty =
    (new software.amazon.awscdk.services.opsworks.CfnStack.ChefConfigurationProperty.Builder)
      .manageBerkshelf(manageBerkshelf.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .berkshelfVersion(berkshelfVersion.orNull)
      .build()
}
