package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DynamoGetItem {

  def apply(
    internalResourceId: String,
    key: Map[String, _ <: software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue],
    table: software.amazon.awscdk.services.dynamodb.ITable,
    consistentRead: Option[Boolean] = None,
    resultPath: Option[String] = None,
    projectionExpression: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.DynamoProjectionExpression]] = None,
    returnConsumedCapacity: Option[software.amazon.awscdk.services.stepfunctions.tasks.DynamoConsumedCapacity] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    expressionAttributeNames: Option[Map[String, String]] = None,
    resultSelector: Option[Map[String, _]] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItem =
    software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItem.Builder
      .create(stackCtx, internalResourceId)
      .key(key.asJava)
      .table(table)
      .consistentRead(consistentRead.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .resultPath(resultPath.orNull)
      .projectionExpression(projectionExpression.map(_.asJava).orNull)
      .returnConsumedCapacity(returnConsumedCapacity.orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .expressionAttributeNames(expressionAttributeNames.map(_.asJava).orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .heartbeat(heartbeat.orNull)
      .build()
}
