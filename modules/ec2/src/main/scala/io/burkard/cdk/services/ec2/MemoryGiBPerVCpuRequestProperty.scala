package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MemoryGiBPerVCpuRequestProperty {

  def apply(
    min: Option[Number] = None,
    max: Option[Number] = None
  ): software.amazon.awscdk.services.ec2.CfnEC2Fleet.MemoryGiBPerVCpuRequestProperty =
    (new software.amazon.awscdk.services.ec2.CfnEC2Fleet.MemoryGiBPerVCpuRequestProperty.Builder)
      .min(min.orNull)
      .max(max.orNull)
      .build()
}
