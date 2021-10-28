package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Deployment {

  def apply(
    internalResourceId: String,
    description: Option[String] = None,
    retainDeployments: Option[Boolean] = None,
    api: Option[software.amazon.awscdk.services.apigateway.IRestApi] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.Deployment =
    software.amazon.awscdk.services.apigateway.Deployment.Builder
      .create(stackCtx, internalResourceId)
      .description(description.orNull)
      .retainDeployments(retainDeployments.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .api(api.orNull)
      .build()
}