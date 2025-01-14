package io.burkard.cdk.services.sns

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTopicPolicyProps {

  def apply(
    topics: List[String],
    policyDocument: AnyRef
  ): software.amazon.awscdk.services.sns.CfnTopicPolicyProps =
    (new software.amazon.awscdk.services.sns.CfnTopicPolicyProps.Builder)
      .topics(topics.asJava)
      .policyDocument(policyDocument)
      .build()
}
