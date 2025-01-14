package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SchemaChangePolicyProperty {

  def apply(
    deleteBehavior: Option[String] = None,
    updateBehavior: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnCrawler.SchemaChangePolicyProperty =
    (new software.amazon.awscdk.services.glue.CfnCrawler.SchemaChangePolicyProperty.Builder)
      .deleteBehavior(deleteBehavior.orNull)
      .updateBehavior(updateBehavior.orNull)
      .build()
}
