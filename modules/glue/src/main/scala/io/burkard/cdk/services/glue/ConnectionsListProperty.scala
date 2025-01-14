package io.burkard.cdk.services.glue

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConnectionsListProperty {

  def apply(
    connections: Option[List[String]] = None
  ): software.amazon.awscdk.services.glue.CfnJob.ConnectionsListProperty =
    (new software.amazon.awscdk.services.glue.CfnJob.ConnectionsListProperty.Builder)
      .connections(connections.map(_.asJava).orNull)
      .build()
}
