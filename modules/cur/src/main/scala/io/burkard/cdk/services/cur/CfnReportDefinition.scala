package io.burkard.cdk.services.cur

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnReportDefinition {

  def apply(
    internalResourceId: String,
    s3Bucket: String,
    reportName: String,
    s3Prefix: String,
    s3Region: String,
    refreshClosedReports: Boolean,
    format: String,
    reportVersioning: String,
    compression: String,
    timeUnit: String,
    additionalSchemaElements: Option[List[String]] = None,
    billingViewArn: Option[String] = None,
    additionalArtifacts: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cur.CfnReportDefinition =
    software.amazon.awscdk.services.cur.CfnReportDefinition.Builder
      .create(stackCtx, internalResourceId)
      .s3Bucket(s3Bucket)
      .reportName(reportName)
      .s3Prefix(s3Prefix)
      .s3Region(s3Region)
      .refreshClosedReports(refreshClosedReports)
      .format(format)
      .reportVersioning(reportVersioning)
      .compression(compression)
      .timeUnit(timeUnit)
      .additionalSchemaElements(additionalSchemaElements.map(_.asJava).orNull)
      .billingViewArn(billingViewArn.orNull)
      .additionalArtifacts(additionalArtifacts.map(_.asJava).orNull)
      .build()
}
