package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OutputColumnProperty {

  def apply(
    name: Option[String] = None,
    description: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.OutputColumnProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.OutputColumnProperty.Builder)
      .name(name.orNull)
      .description(description.orNull)
      .`type`(`type`.orNull)
      .build()
}
