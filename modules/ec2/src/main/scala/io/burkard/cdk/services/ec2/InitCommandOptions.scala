package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InitCommandOptions {

  def apply(
    waitAfterCompletion: Option[software.amazon.awscdk.services.ec2.InitCommandWaitDuration] = None,
    serviceRestartHandles: Option[List[_ <: software.amazon.awscdk.services.ec2.InitServiceRestartHandle]] = None,
    key: Option[String] = None,
    ignoreErrors: Option[Boolean] = None,
    cwd: Option[String] = None,
    testCmd: Option[String] = None,
    env: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.ec2.InitCommandOptions =
    (new software.amazon.awscdk.services.ec2.InitCommandOptions.Builder)
      .waitAfterCompletion(waitAfterCompletion.orNull)
      .serviceRestartHandles(serviceRestartHandles.map(_.asJava).orNull)
      .key(key.orNull)
      .ignoreErrors(ignoreErrors.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cwd(cwd.orNull)
      .testCmd(testCmd.orNull)
      .env(env.map(_.asJava).orNull)
      .build()
}
