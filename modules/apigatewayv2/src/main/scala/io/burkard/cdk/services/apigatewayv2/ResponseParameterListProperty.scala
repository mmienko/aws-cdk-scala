package io.burkard.cdk.services.apigatewayv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResponseParameterListProperty {

  def apply(
    responseParameters: Option[List[_]] = None
  ): software.amazon.awscdk.services.apigatewayv2.CfnIntegration.ResponseParameterListProperty =
    (new software.amazon.awscdk.services.apigatewayv2.CfnIntegration.ResponseParameterListProperty.Builder)
      .responseParameters(responseParameters.map(_.asJava).orNull)
      .build()
}
