package io.burkard.cdk.services.s3

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStorageLensProps {

  def apply(
    storageLensConfiguration: software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensConfigurationProperty,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.s3.CfnStorageLensProps =
    (new software.amazon.awscdk.services.s3.CfnStorageLensProps.Builder)
      .storageLensConfiguration(storageLensConfiguration)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
