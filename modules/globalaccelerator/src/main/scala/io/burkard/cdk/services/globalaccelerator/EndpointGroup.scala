package io.burkard.cdk.services.globalaccelerator

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EndpointGroup {

  def apply(
    internalResourceId: String,
    listener: software.amazon.awscdk.services.globalaccelerator.IListener,
    endpoints: Option[List[_ <: software.amazon.awscdk.services.globalaccelerator.IEndpoint]] = None,
    endpointGroupName: Option[String] = None,
    healthCheckInterval: Option[software.amazon.awscdk.Duration] = None,
    trafficDialPercentage: Option[Number] = None,
    healthCheckPath: Option[String] = None,
    healthCheckPort: Option[Number] = None,
    region: Option[String] = None,
    healthCheckThreshold: Option[Number] = None,
    portOverrides: Option[List[_ <: software.amazon.awscdk.services.globalaccelerator.PortOverride]] = None,
    healthCheckProtocol: Option[software.amazon.awscdk.services.globalaccelerator.HealthCheckProtocol] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.globalaccelerator.EndpointGroup =
    software.amazon.awscdk.services.globalaccelerator.EndpointGroup.Builder
      .create(stackCtx, internalResourceId)
      .listener(listener)
      .endpoints(endpoints.map(_.asJava).orNull)
      .endpointGroupName(endpointGroupName.orNull)
      .healthCheckInterval(healthCheckInterval.orNull)
      .trafficDialPercentage(trafficDialPercentage.orNull)
      .healthCheckPath(healthCheckPath.orNull)
      .healthCheckPort(healthCheckPort.orNull)
      .region(region.orNull)
      .healthCheckThreshold(healthCheckThreshold.orNull)
      .portOverrides(portOverrides.map(_.asJava).orNull)
      .healthCheckProtocol(healthCheckProtocol.orNull)
      .build()
}
