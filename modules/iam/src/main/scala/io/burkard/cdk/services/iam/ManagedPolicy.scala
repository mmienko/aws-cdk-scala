package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ManagedPolicy {

  def apply(
    internalResourceId: String,
    path: Option[String] = None,
    users: Option[List[_ <: software.amazon.awscdk.services.iam.IUser]] = None,
    groups: Option[List[_ <: software.amazon.awscdk.services.iam.IGroup]] = None,
    roles: Option[List[_ <: software.amazon.awscdk.services.iam.IRole]] = None,
    statements: Option[List[_ <: software.amazon.awscdk.services.iam.PolicyStatement]] = None,
    managedPolicyName: Option[String] = None,
    description: Option[String] = None,
    document: Option[software.amazon.awscdk.services.iam.PolicyDocument] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iam.ManagedPolicy =
    software.amazon.awscdk.services.iam.ManagedPolicy.Builder
      .create(stackCtx, internalResourceId)
      .path(path.orNull)
      .users(users.map(_.asJava).orNull)
      .groups(groups.map(_.asJava).orNull)
      .roles(roles.map(_.asJava).orNull)
      .statements(statements.map(_.asJava).orNull)
      .managedPolicyName(managedPolicyName.orNull)
      .description(description.orNull)
      .document(document.orNull)
      .build()
}
