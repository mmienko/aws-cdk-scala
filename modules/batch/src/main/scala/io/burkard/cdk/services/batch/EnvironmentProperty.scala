package io.burkard.cdk.services.batch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EnvironmentProperty {

  def apply(
    name: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.batch.CfnJobDefinition.EnvironmentProperty =
    (new software.amazon.awscdk.services.batch.CfnJobDefinition.EnvironmentProperty.Builder)
      .name(name.orNull)
      .value(value.orNull)
      .build()
}
