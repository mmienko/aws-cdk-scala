package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ColumnDescriptionProperty {

  def apply(
    text: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnDescriptionProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnDescriptionProperty.Builder)
      .text(text.orNull)
      .build()
}
