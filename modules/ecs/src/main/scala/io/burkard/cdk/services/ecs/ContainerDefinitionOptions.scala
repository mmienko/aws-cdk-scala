package io.burkard.cdk.services.ecs

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ContainerDefinitionOptions {

  def apply(
    dockerSecurityOptions: Option[List[String]] = None,
    healthCheck: Option[software.amazon.awscdk.services.ecs.HealthCheck] = None,
    hostname: Option[String] = None,
    dnsSearchDomains: Option[List[String]] = None,
    command: Option[List[String]] = None,
    environmentFiles: Option[List[_ <: software.amazon.awscdk.services.ecs.EnvironmentFile]] = None,
    linuxParameters: Option[software.amazon.awscdk.services.ecs.LinuxParameters] = None,
    workingDirectory: Option[String] = None,
    dockerLabels: Option[Map[String, String]] = None,
    privileged: Option[Boolean] = None,
    startTimeout: Option[software.amazon.awscdk.Duration] = None,
    user: Option[String] = None,
    containerName: Option[String] = None,
    memoryLimitMiB: Option[Number] = None,
    logging: Option[software.amazon.awscdk.services.ecs.LogDriver] = None,
    stopTimeout: Option[software.amazon.awscdk.Duration] = None,
    secrets: Option[Map[String, _ <: software.amazon.awscdk.services.ecs.Secret]] = None,
    entryPoint: Option[List[String]] = None,
    portMappings: Option[List[_ <: software.amazon.awscdk.services.ecs.PortMapping]] = None,
    essential: Option[Boolean] = None,
    readonlyRootFilesystem: Option[Boolean] = None,
    image: Option[software.amazon.awscdk.services.ecs.ContainerImage] = None,
    gpuCount: Option[Number] = None,
    inferenceAcceleratorResources: Option[List[String]] = None,
    cpu: Option[Number] = None,
    environment: Option[Map[String, String]] = None,
    extraHosts: Option[Map[String, String]] = None,
    memoryReservationMiB: Option[Number] = None,
    disableNetworking: Option[Boolean] = None,
    dnsServers: Option[List[String]] = None
  ): software.amazon.awscdk.services.ecs.ContainerDefinitionOptions =
    (new software.amazon.awscdk.services.ecs.ContainerDefinitionOptions.Builder)
      .dockerSecurityOptions(dockerSecurityOptions.map(_.asJava).orNull)
      .healthCheck(healthCheck.orNull)
      .hostname(hostname.orNull)
      .dnsSearchDomains(dnsSearchDomains.map(_.asJava).orNull)
      .command(command.map(_.asJava).orNull)
      .environmentFiles(environmentFiles.map(_.asJava).orNull)
      .linuxParameters(linuxParameters.orNull)
      .workingDirectory(workingDirectory.orNull)
      .dockerLabels(dockerLabels.map(_.asJava).orNull)
      .privileged(privileged.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .startTimeout(startTimeout.orNull)
      .user(user.orNull)
      .containerName(containerName.orNull)
      .memoryLimitMiB(memoryLimitMiB.orNull)
      .logging(logging.orNull)
      .stopTimeout(stopTimeout.orNull)
      .secrets(secrets.map(_.asJava).orNull)
      .entryPoint(entryPoint.map(_.asJava).orNull)
      .portMappings(portMappings.map(_.asJava).orNull)
      .essential(essential.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .readonlyRootFilesystem(readonlyRootFilesystem.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .image(image.orNull)
      .gpuCount(gpuCount.orNull)
      .inferenceAcceleratorResources(inferenceAcceleratorResources.map(_.asJava).orNull)
      .cpu(cpu.orNull)
      .environment(environment.map(_.asJava).orNull)
      .extraHosts(extraHosts.map(_.asJava).orNull)
      .memoryReservationMiB(memoryReservationMiB.orNull)
      .disableNetworking(disableNetworking.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .dnsServers(dnsServers.map(_.asJava).orNull)
      .build()
}