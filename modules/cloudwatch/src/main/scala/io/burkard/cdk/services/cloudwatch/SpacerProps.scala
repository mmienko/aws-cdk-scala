package io.burkard.cdk.services.cloudwatch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SpacerProps {

  def apply(
    height: Option[Number] = None,
    width: Option[Number] = None
  ): software.amazon.awscdk.services.cloudwatch.SpacerProps =
    (new software.amazon.awscdk.services.cloudwatch.SpacerProps.Builder)
      .height(height.orNull)
      .width(width.orNull)
      .build()
}
