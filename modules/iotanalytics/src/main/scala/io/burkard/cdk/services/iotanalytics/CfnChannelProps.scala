package io.burkard.cdk.services.iotanalytics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnChannelProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    retentionPeriod: Option[software.amazon.awscdk.services.iotanalytics.CfnChannel.RetentionPeriodProperty] = None,
    channelName: Option[String] = None,
    channelStorage: Option[software.amazon.awscdk.services.iotanalytics.CfnChannel.ChannelStorageProperty] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnChannelProps =
    (new software.amazon.awscdk.services.iotanalytics.CfnChannelProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .retentionPeriod(retentionPeriod.orNull)
      .channelName(channelName.orNull)
      .channelStorage(channelStorage.orNull)
      .build()
}
