package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IntrinsicProps {

  def apply(
    stackTrace: Option[Boolean] = None
  ): software.amazon.awscdk.IntrinsicProps =
    (new software.amazon.awscdk.IntrinsicProps.Builder)
      .stackTrace(stackTrace.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
