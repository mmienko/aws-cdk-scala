package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LambdaDestinationOptions {

  def apply(
    addPermissions: Option[Boolean] = None
  ): software.amazon.awscdk.services.logs.destinations.LambdaDestinationOptions =
    (new software.amazon.awscdk.services.logs.destinations.LambdaDestinationOptions.Builder)
      .addPermissions(addPermissions.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
