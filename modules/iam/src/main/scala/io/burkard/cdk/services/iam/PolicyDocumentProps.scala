package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PolicyDocumentProps {

  def apply(
    assignSids: Option[Boolean] = None,
    statements: Option[List[_ <: software.amazon.awscdk.services.iam.PolicyStatement]] = None
  ): software.amazon.awscdk.services.iam.PolicyDocumentProps =
    (new software.amazon.awscdk.services.iam.PolicyDocumentProps.Builder)
      .assignSids(assignSids.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .statements(statements.map(_.asJava).orNull)
      .build()
}
