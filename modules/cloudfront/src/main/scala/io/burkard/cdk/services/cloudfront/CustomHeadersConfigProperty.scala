package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomHeadersConfigProperty {

  def apply(
    items: List[_]
  ): software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CustomHeadersConfigProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CustomHeadersConfigProperty.Builder)
      .items(items.asJava)
      .build()
}