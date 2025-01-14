package io.burkard.cdk.services.codeguruprofiler

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ProfilingGroupProps {

  def apply(
    profilingGroupName: Option[String] = None,
    computePlatform: Option[software.amazon.awscdk.services.codeguruprofiler.ComputePlatform] = None
  ): software.amazon.awscdk.services.codeguruprofiler.ProfilingGroupProps =
    (new software.amazon.awscdk.services.codeguruprofiler.ProfilingGroupProps.Builder)
      .profilingGroupName(profilingGroupName.orNull)
      .computePlatform(computePlatform.orNull)
      .build()
}
