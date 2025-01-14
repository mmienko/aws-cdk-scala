package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TransformInput {

  def apply(
    transformDataSource: software.amazon.awscdk.services.stepfunctions.tasks.TransformDataSource,
    compressionType: Option[software.amazon.awscdk.services.stepfunctions.tasks.CompressionType] = None,
    contentType: Option[String] = None,
    splitType: Option[software.amazon.awscdk.services.stepfunctions.tasks.SplitType] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.TransformInput =
    (new software.amazon.awscdk.services.stepfunctions.tasks.TransformInput.Builder)
      .transformDataSource(transformDataSource)
      .compressionType(compressionType.orNull)
      .contentType(contentType.orNull)
      .splitType(splitType.orNull)
      .build()
}
