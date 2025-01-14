package io.burkard.cdk.services.ssm

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RuleGroupProperty {

  def apply(
    patchRules: Option[List[_]] = None
  ): software.amazon.awscdk.services.ssm.CfnPatchBaseline.RuleGroupProperty =
    (new software.amazon.awscdk.services.ssm.CfnPatchBaseline.RuleGroupProperty.Builder)
      .patchRules(patchRules.map(_.asJava).orNull)
      .build()
}
