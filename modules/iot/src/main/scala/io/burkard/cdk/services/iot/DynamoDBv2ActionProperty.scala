package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DynamoDBv2ActionProperty {

  def apply(
    roleArn: Option[String] = None,
    putItem: Option[software.amazon.awscdk.services.iot.CfnTopicRule.PutItemInputProperty] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBv2ActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBv2ActionProperty.Builder)
      .roleArn(roleArn.orNull)
      .putItem(putItem.orNull)
      .build()
}
