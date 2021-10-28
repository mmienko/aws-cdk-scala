package io.burkard.cdk.services.dlm

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ParametersProperty {

  def apply(
    noReboot: Option[Boolean] = None,
    excludeBootVolume: Option[Boolean] = None
  ): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ParametersProperty =
    (new software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ParametersProperty.Builder)
      .noReboot(noReboot.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .excludeBootVolume(excludeBootVolume.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}