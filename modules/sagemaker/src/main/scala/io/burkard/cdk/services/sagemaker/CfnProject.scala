package io.burkard.cdk.services.sagemaker

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnProject {

  def apply(
    internalResourceId: String,
    projectName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    projectDescription: Option[String] = None,
    serviceCatalogProvisioningDetails: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sagemaker.CfnProject =
    software.amazon.awscdk.services.sagemaker.CfnProject.Builder
      .create(stackCtx, internalResourceId)
      .projectName(projectName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .projectDescription(projectDescription.orNull)
      .serviceCatalogProvisioningDetails(serviceCatalogProvisioningDetails.orNull)
      .build()
}