package io.burkard.cdk.services.codecommit

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRepository {

  def apply(
    internalResourceId: String,
    repositoryName: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    repositoryDescription: Option[String] = None,
    code: Option[software.amazon.awscdk.services.codecommit.CfnRepository.CodeProperty] = None,
    triggers: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codecommit.CfnRepository =
    software.amazon.awscdk.services.codecommit.CfnRepository.Builder
      .create(stackCtx, internalResourceId)
      .repositoryName(repositoryName)
      .tags(tags.map(_.asJava).orNull)
      .repositoryDescription(repositoryDescription.orNull)
      .code(code.orNull)
      .triggers(triggers.map(_.asJava).orNull)
      .build()
}
