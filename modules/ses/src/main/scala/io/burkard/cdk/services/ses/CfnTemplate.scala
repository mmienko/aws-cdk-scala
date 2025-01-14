package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTemplate {

  def apply(
    internalResourceId: String,
    template: Option[software.amazon.awscdk.services.ses.CfnTemplate.TemplateProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ses.CfnTemplate =
    software.amazon.awscdk.services.ses.CfnTemplate.Builder
      .create(stackCtx, internalResourceId)
      .template(template.orNull)
      .build()
}
