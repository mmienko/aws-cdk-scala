package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MinimumHealthyHostsProperty {

  def apply(
    `type`: Option[String] = None,
    value: Option[Number] = None
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsProperty.Builder)
      .`type`(`type`.orNull)
      .value(value.orNull)
      .build()
}