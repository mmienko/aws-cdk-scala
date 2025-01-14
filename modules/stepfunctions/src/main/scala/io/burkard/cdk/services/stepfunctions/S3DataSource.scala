package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3DataSource {

  def apply(
    s3Location: software.amazon.awscdk.services.stepfunctions.tasks.S3Location,
    s3DataType: Option[software.amazon.awscdk.services.stepfunctions.tasks.S3DataType] = None,
    s3DataDistributionType: Option[software.amazon.awscdk.services.stepfunctions.tasks.S3DataDistributionType] = None,
    attributeNames: Option[List[String]] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.S3DataSource =
    (new software.amazon.awscdk.services.stepfunctions.tasks.S3DataSource.Builder)
      .s3Location(s3Location)
      .s3DataType(s3DataType.orNull)
      .s3DataDistributionType(s3DataDistributionType.orNull)
      .attributeNames(attributeNames.map(_.asJava).orNull)
      .build()
}
