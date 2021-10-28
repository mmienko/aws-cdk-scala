package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SubscriptionFilterOptions {

  def apply(
    filterPattern: Option[software.amazon.awscdk.services.logs.IFilterPattern] = None,
    destination: Option[software.amazon.awscdk.services.logs.ILogSubscriptionDestination] = None
  ): software.amazon.awscdk.services.logs.SubscriptionFilterOptions =
    (new software.amazon.awscdk.services.logs.SubscriptionFilterOptions.Builder)
      .filterPattern(filterPattern.orNull)
      .destination(destination.orNull)
      .build()
}