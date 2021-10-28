package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TaskPropertiesObjectProperty {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.TaskPropertiesObjectProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.TaskPropertiesObjectProperty.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}