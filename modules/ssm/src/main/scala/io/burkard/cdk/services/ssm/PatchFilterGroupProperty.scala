package io.burkard.cdk.services.ssm

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PatchFilterGroupProperty {

  def apply(
    patchFilters: Option[List[_]] = None
  ): software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchFilterGroupProperty =
    (new software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchFilterGroupProperty.Builder)
      .patchFilters(patchFilters.map(_.asJava).orNull)
      .build()
}
