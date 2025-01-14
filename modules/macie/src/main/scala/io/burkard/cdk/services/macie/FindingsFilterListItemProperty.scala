package io.burkard.cdk.services.macie

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FindingsFilterListItemProperty {

  def apply(
    name: Option[String] = None,
    id: Option[String] = None
  ): software.amazon.awscdk.services.macie.CfnFindingsFilter.FindingsFilterListItemProperty =
    (new software.amazon.awscdk.services.macie.CfnFindingsFilter.FindingsFilterListItemProperty.Builder)
      .name(name.orNull)
      .id(id.orNull)
      .build()
}
