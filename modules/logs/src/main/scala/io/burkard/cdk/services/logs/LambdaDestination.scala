package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LambdaDestination {

  def apply(
    fn: software.amazon.awscdk.services.lambda.IFunction,
    addPermissions: Option[Boolean] = None
  ): software.amazon.awscdk.services.logs.destinations.LambdaDestination =
    software.amazon.awscdk.services.logs.destinations.LambdaDestination.Builder
      .create(fn)
      .addPermissions(addPermissions.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
