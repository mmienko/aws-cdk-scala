package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEventBusProps {

  def apply(
    name: String,
    eventSourceName: Option[String] = None
  ): software.amazon.awscdk.services.events.CfnEventBusProps =
    (new software.amazon.awscdk.services.events.CfnEventBusProps.Builder)
      .name(name)
      .eventSourceName(eventSourceName.orNull)
      .build()
}
