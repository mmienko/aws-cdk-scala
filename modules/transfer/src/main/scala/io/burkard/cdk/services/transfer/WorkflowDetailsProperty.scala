package io.burkard.cdk.services.transfer

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object WorkflowDetailsProperty {

  def apply(
    onUpload: Option[List[_]] = None
  ): software.amazon.awscdk.services.transfer.CfnServer.WorkflowDetailsProperty =
    (new software.amazon.awscdk.services.transfer.CfnServer.WorkflowDetailsProperty.Builder)
      .onUpload(onUpload.map(_.asJava).orNull)
      .build()
}