package io.burkard.cdk.services.sagemaker

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAppProps {

  def apply(
    appType: Option[String] = None,
    userProfileName: Option[String] = None,
    resourceSpec: Option[software.amazon.awscdk.services.sagemaker.CfnApp.ResourceSpecProperty] = None,
    domainId: Option[String] = None,
    appName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.sagemaker.CfnAppProps =
    (new software.amazon.awscdk.services.sagemaker.CfnAppProps.Builder)
      .appType(appType.orNull)
      .userProfileName(userProfileName.orNull)
      .resourceSpec(resourceSpec.orNull)
      .domainId(domainId.orNull)
      .appName(appName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}