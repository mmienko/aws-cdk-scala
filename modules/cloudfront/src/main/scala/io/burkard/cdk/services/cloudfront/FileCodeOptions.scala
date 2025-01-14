package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FileCodeOptions {

  def apply(
    filePath: String
  ): software.amazon.awscdk.services.cloudfront.FileCodeOptions =
    (new software.amazon.awscdk.services.cloudfront.FileCodeOptions.Builder)
      .filePath(filePath)
      .build()
}
