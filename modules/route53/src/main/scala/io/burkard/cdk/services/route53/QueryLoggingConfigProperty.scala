package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object QueryLoggingConfigProperty {

  def apply(
    cloudWatchLogsLogGroupArn: String
  ): software.amazon.awscdk.services.route53.CfnHostedZone.QueryLoggingConfigProperty =
    (new software.amazon.awscdk.services.route53.CfnHostedZone.QueryLoggingConfigProperty.Builder)
      .cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn)
      .build()
}
