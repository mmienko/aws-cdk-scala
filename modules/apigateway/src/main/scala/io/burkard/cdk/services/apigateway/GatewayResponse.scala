package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GatewayResponse {

  def apply(
    internalResourceId: String,
    restApi: software.amazon.awscdk.services.apigateway.IRestApi,
    statusCode: Option[String] = None,
    responseHeaders: Option[Map[String, String]] = None,
    templates: Option[Map[String, String]] = None,
    `type`: Option[software.amazon.awscdk.services.apigateway.ResponseType] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.GatewayResponse =
    software.amazon.awscdk.services.apigateway.GatewayResponse.Builder
      .create(stackCtx, internalResourceId)
      .restApi(restApi)
      .statusCode(statusCode.orNull)
      .responseHeaders(responseHeaders.map(_.asJava).orNull)
      .templates(templates.map(_.asJava).orNull)
      .`type`(`type`.orNull)
      .build()
}
