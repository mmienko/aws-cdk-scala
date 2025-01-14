package io.burkard.cdk.services.imagebuilder

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnComponentProps {

  def apply(
    name: String,
    version: String,
    platform: String,
    changeDescription: Option[String] = None,
    data: Option[String] = None,
    uri: Option[String] = None,
    supportedOsVersions: Option[List[String]] = None,
    kmsKeyId: Option[String] = None,
    description: Option[String] = None,
    tags: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.imagebuilder.CfnComponentProps =
    (new software.amazon.awscdk.services.imagebuilder.CfnComponentProps.Builder)
      .name(name)
      .version(version)
      .platform(platform)
      .changeDescription(changeDescription.orNull)
      .data(data.orNull)
      .uri(uri.orNull)
      .supportedOsVersions(supportedOsVersions.map(_.asJava).orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
