package io.burkard.cdk.services.servicecatalog

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCloudFormationProvisionedProductProps {

  def apply(
    provisionedProductName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    pathName: Option[String] = None,
    pathId: Option[String] = None,
    notificationArns: Option[List[String]] = None,
    provisioningParameters: Option[List[_]] = None,
    acceptLanguage: Option[String] = None,
    productName: Option[String] = None,
    provisioningArtifactName: Option[String] = None,
    provisioningPreferences: Option[software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty] = None,
    provisioningArtifactId: Option[String] = None,
    productId: Option[String] = None
  ): software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProductProps =
    (new software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProductProps.Builder)
      .provisionedProductName(provisionedProductName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .pathName(pathName.orNull)
      .pathId(pathId.orNull)
      .notificationArns(notificationArns.map(_.asJava).orNull)
      .provisioningParameters(provisioningParameters.map(_.asJava).orNull)
      .acceptLanguage(acceptLanguage.orNull)
      .productName(productName.orNull)
      .provisioningArtifactName(provisioningArtifactName.orNull)
      .provisioningPreferences(provisioningPreferences.orNull)
      .provisioningArtifactId(provisioningArtifactId.orNull)
      .productId(productId.orNull)
      .build()
}
