package io.burkard.cdk.services.apigatewayv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVpcLink {

  def apply(
    internalResourceId: String,
    subnetIds: List[String],
    name: String,
    tags: Option[AnyRef] = None,
    securityGroupIds: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigatewayv2.CfnVpcLink =
    software.amazon.awscdk.services.apigatewayv2.CfnVpcLink.Builder
      .create(stackCtx, internalResourceId)
      .subnetIds(subnetIds.asJava)
      .name(name)
      .tags(tags.orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .build()
}
