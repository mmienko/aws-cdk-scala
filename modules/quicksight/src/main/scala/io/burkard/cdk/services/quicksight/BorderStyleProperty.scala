package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BorderStyleProperty {

  def apply(
    show: Option[Boolean] = None
  ): software.amazon.awscdk.services.quicksight.CfnTheme.BorderStyleProperty =
    (new software.amazon.awscdk.services.quicksight.CfnTheme.BorderStyleProperty.Builder)
      .show(show.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
