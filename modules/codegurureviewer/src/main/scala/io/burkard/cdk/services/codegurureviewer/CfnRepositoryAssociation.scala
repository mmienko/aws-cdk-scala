package io.burkard.cdk.services.codegurureviewer

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRepositoryAssociation {

  def apply(
    internalResourceId: String,
    name: String,
    `type`: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    connectionArn: Option[String] = None,
    owner: Option[String] = None,
    bucketName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociation =
    software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociation.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .`type`(`type`)
      .tags(tags.map(_.asJava).orNull)
      .connectionArn(connectionArn.orNull)
      .owner(owner.orNull)
      .bucketName(bucketName.orNull)
      .build()
}
