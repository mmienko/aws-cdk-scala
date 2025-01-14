package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnBasePathMapping {

  def apply(
    internalResourceId: String,
    domainName: String,
    stage: Option[String] = None,
    basePath: Option[String] = None,
    restApiId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CfnBasePathMapping =
    software.amazon.awscdk.services.apigateway.CfnBasePathMapping.Builder
      .create(stackCtx, internalResourceId)
      .domainName(domainName)
      .stage(stage.orNull)
      .basePath(basePath.orNull)
      .restApiId(restApiId.orNull)
      .build()
}
