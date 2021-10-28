package io.burkard.cdk.services.servicediscovery

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SOAProperty {

  def apply(
    ttl: Option[Number] = None
  ): software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.SOAProperty =
    (new software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.SOAProperty.Builder)
      .ttl(ttl.orNull)
      .build()
}