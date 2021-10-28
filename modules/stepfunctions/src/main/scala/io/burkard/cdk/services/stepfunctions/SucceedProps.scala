package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SucceedProps {

  def apply(
    inputPath: Option[String] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.SucceedProps =
    (new software.amazon.awscdk.services.stepfunctions.SucceedProps.Builder)
      .inputPath(inputPath.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .build()
}