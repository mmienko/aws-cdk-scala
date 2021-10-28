package io.burkard.cdk.services.route53recoverycontrol

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnControlPanelProps {

  def apply(
    name: Option[String] = None,
    clusterArn: Option[String] = None
  ): software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanelProps =
    (new software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanelProps.Builder)
      .name(name.orNull)
      .clusterArn(clusterArn.orNull)
      .build()
}