package io.burkard.cdk.services.databrew

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRuleset {

  def apply(
    internalResourceId: String,
    name: String,
    targetArn: String,
    rules: List[_],
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.databrew.CfnRuleset =
    software.amazon.awscdk.services.databrew.CfnRuleset.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .targetArn(targetArn)
      .rules(rules.asJava)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}