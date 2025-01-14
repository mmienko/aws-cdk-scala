package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Tmpfs {

  def apply(
    size: Number,
    containerPath: String,
    mountOptions: Option[List[_ <: software.amazon.awscdk.services.ecs.TmpfsMountOption]] = None
  ): software.amazon.awscdk.services.ecs.Tmpfs =
    (new software.amazon.awscdk.services.ecs.Tmpfs.Builder)
      .size(size)
      .containerPath(containerPath)
      .mountOptions(mountOptions.map(_.asJava).orNull)
      .build()
}
