package io.burkard.cdk.services.servicediscovery

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnInstanceProps {

  def apply(
    instanceId: Option[String] = None,
    instanceAttributes: Option[AnyRef] = None,
    serviceId: Option[String] = None
  ): software.amazon.awscdk.services.servicediscovery.CfnInstanceProps =
    (new software.amazon.awscdk.services.servicediscovery.CfnInstanceProps.Builder)
      .instanceId(instanceId.orNull)
      .instanceAttributes(instanceAttributes.orNull)
      .serviceId(serviceId.orNull)
      .build()
}