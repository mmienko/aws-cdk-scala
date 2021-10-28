package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ExportValueOptions {

  def apply(
    name: Option[String] = None
  ): software.amazon.awscdk.ExportValueOptions =
    (new software.amazon.awscdk.ExportValueOptions.Builder)
      .name(name.orNull)
      .build()
}