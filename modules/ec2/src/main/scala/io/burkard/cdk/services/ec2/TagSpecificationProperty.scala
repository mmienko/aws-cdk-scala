package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TagSpecificationProperty {

  def apply(
    resourceType: String,
    tags: List[_ <: software.amazon.awscdk.CfnTag]
  ): software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.TagSpecificationProperty =
    (new software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.TagSpecificationProperty.Builder)
      .resourceType(resourceType)
      .tags(tags.asJava)
      .build()
}
