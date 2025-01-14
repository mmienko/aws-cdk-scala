package io.burkard.cdk.services.waf

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnIPSetProps {

  def apply(
    name: String,
    ipSetDescriptors: Option[List[_]] = None
  ): software.amazon.awscdk.services.waf.regional.CfnIPSetProps =
    (new software.amazon.awscdk.services.waf.regional.CfnIPSetProps.Builder)
      .name(name)
      .ipSetDescriptors(ipSetDescriptors.map(_.asJava).orNull)
      .build()
}
