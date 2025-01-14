package io.burkard.cdk.services.lakeformation

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPermissions {

  def apply(
    internalResourceId: String,
    dataLakePrincipal: software.amazon.awscdk.services.lakeformation.CfnPermissions.DataLakePrincipalProperty,
    resource: software.amazon.awscdk.services.lakeformation.CfnPermissions.ResourceProperty,
    permissionsWithGrantOption: Option[List[String]] = None,
    permissions: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.lakeformation.CfnPermissions =
    software.amazon.awscdk.services.lakeformation.CfnPermissions.Builder
      .create(stackCtx, internalResourceId)
      .dataLakePrincipal(dataLakePrincipal)
      .resource(resource)
      .permissionsWithGrantOption(permissionsWithGrantOption.map(_.asJava).orNull)
      .permissions(permissions.map(_.asJava).orNull)
      .build()
}
