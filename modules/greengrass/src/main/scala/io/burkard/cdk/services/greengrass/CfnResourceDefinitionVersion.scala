package io.burkard.cdk.services.greengrass

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResourceDefinitionVersion {

  def apply(
    internalResourceId: String,
    resources: List[_],
    resourceDefinitionId: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion =
    software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.Builder
      .create(stackCtx, internalResourceId)
      .resources(resources.asJava)
      .resourceDefinitionId(resourceDefinitionId)
      .build()
}
