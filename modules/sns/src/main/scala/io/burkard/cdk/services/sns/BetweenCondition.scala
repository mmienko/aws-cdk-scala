package io.burkard.cdk.services.sns

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BetweenCondition {

  def apply(
    stop: Option[Number] = None,
    start: Option[Number] = None
  ): software.amazon.awscdk.services.sns.BetweenCondition =
    (new software.amazon.awscdk.services.sns.BetweenCondition.Builder)
      .stop(stop.orNull)
      .start(start.orNull)
      .build()
}