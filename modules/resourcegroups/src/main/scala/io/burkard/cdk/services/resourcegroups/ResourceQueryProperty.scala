package io.burkard.cdk.services.resourcegroups

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResourceQueryProperty {

  def apply(
    query: Option[software.amazon.awscdk.services.resourcegroups.CfnGroup.QueryProperty] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.resourcegroups.CfnGroup.ResourceQueryProperty =
    (new software.amazon.awscdk.services.resourcegroups.CfnGroup.ResourceQueryProperty.Builder)
      .query(query.orNull)
      .`type`(`type`.orNull)
      .build()
}
