package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StreamOptions {

  def apply(
    logStreamName: Option[String] = None
  ): software.amazon.awscdk.services.logs.StreamOptions =
    (new software.amazon.awscdk.services.logs.StreamOptions.Builder)
      .logStreamName(logStreamName.orNull)
      .build()
}