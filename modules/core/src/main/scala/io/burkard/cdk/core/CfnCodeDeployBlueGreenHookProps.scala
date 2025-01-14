package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCodeDeployBlueGreenHookProps {

  def apply(
    applications: List[_ <: software.amazon.awscdk.CfnCodeDeployBlueGreenApplication],
    serviceRole: String,
    trafficRoutingConfig: Option[software.amazon.awscdk.CfnTrafficRoutingConfig] = None,
    additionalOptions: Option[software.amazon.awscdk.CfnCodeDeployBlueGreenAdditionalOptions] = None,
    lifecycleEventHooks: Option[software.amazon.awscdk.CfnCodeDeployBlueGreenLifecycleEventHooks] = None
  ): software.amazon.awscdk.CfnCodeDeployBlueGreenHookProps =
    (new software.amazon.awscdk.CfnCodeDeployBlueGreenHookProps.Builder)
      .applications(applications.asJava)
      .serviceRole(serviceRole)
      .trafficRoutingConfig(trafficRoutingConfig.orNull)
      .additionalOptions(additionalOptions.orNull)
      .lifecycleEventHooks(lifecycleEventHooks.orNull)
      .build()
}
