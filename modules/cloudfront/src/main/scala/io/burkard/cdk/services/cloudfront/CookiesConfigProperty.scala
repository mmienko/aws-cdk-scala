package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CookiesConfigProperty {

  def apply(
    cookieBehavior: String,
    cookies: Option[List[String]] = None
  ): software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.CookiesConfigProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.CookiesConfigProperty.Builder)
      .cookieBehavior(cookieBehavior)
      .cookies(cookies.map(_.asJava).orNull)
      .build()
}
