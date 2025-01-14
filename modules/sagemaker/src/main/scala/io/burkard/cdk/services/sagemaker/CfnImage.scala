package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnImage {

  def apply(
    internalResourceId: String,
    imageName: String,
    imageRoleArn: String,
    imageDisplayName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    imageDescription: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sagemaker.CfnImage =
    software.amazon.awscdk.services.sagemaker.CfnImage.Builder
      .create(stackCtx, internalResourceId)
      .imageName(imageName)
      .imageRoleArn(imageRoleArn)
      .imageDisplayName(imageDisplayName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .imageDescription(imageDescription.orNull)
      .build()
}
