package io.burkard.cdk.services.sqs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object QueueAttributes {

  def apply(
    queueArn: String,
    queueUrl: Option[String] = None,
    keyArn: Option[String] = None,
    queueName: Option[String] = None,
    fifo: Option[Boolean] = None
  ): software.amazon.awscdk.services.sqs.QueueAttributes =
    (new software.amazon.awscdk.services.sqs.QueueAttributes.Builder)
      .queueArn(queueArn)
      .queueUrl(queueUrl.orNull)
      .keyArn(keyArn.orNull)
      .queueName(queueName.orNull)
      .fifo(fifo.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
