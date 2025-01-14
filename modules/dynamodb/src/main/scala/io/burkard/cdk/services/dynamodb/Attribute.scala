package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Attribute {

  def apply(
    name: String,
    `type`: software.amazon.awscdk.services.dynamodb.AttributeType
  ): software.amazon.awscdk.services.dynamodb.Attribute =
    (new software.amazon.awscdk.services.dynamodb.Attribute.Builder)
      .name(name)
      .`type`(`type`)
      .build()
}
