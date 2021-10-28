package io.burkard.cdk.services.sagemaker

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AutoRollbackConfigProperty {

  def apply(
    alarms: Option[List[_]] = None
  ): software.amazon.awscdk.services.sagemaker.CfnEndpoint.AutoRollbackConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnEndpoint.AutoRollbackConfigProperty.Builder)
      .alarms(alarms.map(_.asJava).orNull)
      .build()
}