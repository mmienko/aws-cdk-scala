package io.burkard.cdk.services.cloudformation

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPublicTypeVersion {

  def apply(
    internalResourceId: String,
    arn: Option[String] = None,
    typeName: Option[String] = None,
    logDeliveryBucket: Option[String] = None,
    publicVersionNumber: Option[String] = None,
    `type`: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudformation.CfnPublicTypeVersion =
    software.amazon.awscdk.services.cloudformation.CfnPublicTypeVersion.Builder
      .create(stackCtx, internalResourceId)
      .arn(arn.orNull)
      .typeName(typeName.orNull)
      .logDeliveryBucket(logDeliveryBucket.orNull)
      .publicVersionNumber(publicVersionNumber.orNull)
      .`type`(`type`.orNull)
      .build()
}