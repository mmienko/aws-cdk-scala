package io.burkard.cdk.services.auditmanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AssessmentReportsDestinationProperty {

  def apply(
    destinationType: Option[String] = None,
    destination: Option[String] = None
  ): software.amazon.awscdk.services.auditmanager.CfnAssessment.AssessmentReportsDestinationProperty =
    (new software.amazon.awscdk.services.auditmanager.CfnAssessment.AssessmentReportsDestinationProperty.Builder)
      .destinationType(destinationType.orNull)
      .destination(destination.orNull)
      .build()
}
