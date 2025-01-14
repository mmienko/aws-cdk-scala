package io.burkard.cdk.services.dynamodb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LocalSecondaryIndexProperty {

  def apply(
    projection: software.amazon.awscdk.services.dynamodb.CfnTable.ProjectionProperty,
    indexName: String,
    keySchema: List[_]
  ): software.amazon.awscdk.services.dynamodb.CfnTable.LocalSecondaryIndexProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnTable.LocalSecondaryIndexProperty.Builder)
      .projection(projection)
      .indexName(indexName)
      .keySchema(keySchema.asJava)
      .build()
}
