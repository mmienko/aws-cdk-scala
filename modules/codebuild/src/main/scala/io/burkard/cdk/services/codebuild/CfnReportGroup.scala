package io.burkard.cdk.services.codebuild

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnReportGroup {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    exportConfig: Option[software.amazon.awscdk.services.codebuild.CfnReportGroup.ReportExportConfigProperty] = None,
    deleteReports: Option[Boolean] = None,
    `type`: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codebuild.CfnReportGroup =
    software.amazon.awscdk.services.codebuild.CfnReportGroup.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .exportConfig(exportConfig.orNull)
      .deleteReports(deleteReports.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .`type`(`type`.orNull)
      .build()
}