package io.burkard.cdk.services.mediaconvert

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HopDestinationProperty {

  def apply(
    priority: Option[Number] = None,
    queue: Option[String] = None,
    waitMinutes: Option[Number] = None
  ): software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.HopDestinationProperty =
    (new software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.HopDestinationProperty.Builder)
      .priority(priority.orNull)
      .queue(queue.orNull)
      .waitMinutes(waitMinutes.orNull)
      .build()
}
