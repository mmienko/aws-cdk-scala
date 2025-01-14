package io.burkard.cdk.services.ses

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnContactList {

  def apply(
    internalResourceId: String,
    topics: Option[List[_]] = None,
    contactListName: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ses.CfnContactList =
    software.amazon.awscdk.services.ses.CfnContactList.Builder
      .create(stackCtx, internalResourceId)
      .topics(topics.map(_.asJava).orNull)
      .contactListName(contactListName.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
