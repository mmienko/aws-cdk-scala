package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVPCEndpointServicePermissions {

  def apply(
    internalResourceId: String,
    serviceId: String,
    allowedPrincipals: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissions =
    software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissions.Builder
      .create(stackCtx, internalResourceId)
      .serviceId(serviceId)
      .allowedPrincipals(allowedPrincipals.map(_.asJava).orNull)
      .build()
}
