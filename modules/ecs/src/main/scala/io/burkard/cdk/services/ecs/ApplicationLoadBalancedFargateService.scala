package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApplicationLoadBalancedFargateService {

  def apply(
    internalResourceId: String,
    healthCheckGracePeriod: Option[software.amazon.awscdk.Duration] = None,
    platformVersion: Option[software.amazon.awscdk.services.ecs.FargatePlatformVersion] = None,
    targetProtocol: Option[software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol] = None,
    desiredCount: Option[Number] = None,
    serviceName: Option[String] = None,
    sslPolicy: Option[software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy] = None,
    circuitBreaker: Option[software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker] = None,
    publicLoadBalancer: Option[Boolean] = None,
    openListener: Option[Boolean] = None,
    protocol: Option[software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol] = None,
    minHealthyPercent: Option[Number] = None,
    protocolVersion: Option[software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocolVersion] = None,
    recordType: Option[software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceRecordType] = None,
    certificate: Option[software.amazon.awscdk.services.certificatemanager.ICertificate] = None,
    memoryLimitMiB: Option[Number] = None,
    domainZone: Option[software.amazon.awscdk.services.route53.IHostedZone] = None,
    domainName: Option[String] = None,
    maxHealthyPercent: Option[Number] = None,
    cluster: Option[software.amazon.awscdk.services.ecs.ICluster] = None,
    assignPublicIp: Option[Boolean] = None,
    redirectHttp: Option[Boolean] = None,
    propagateTags: Option[software.amazon.awscdk.services.ecs.PropagatedTagSource] = None,
    enableEcsManagedTags: Option[Boolean] = None,
    loadBalancerName: Option[String] = None,
    cpu: Option[Number] = None,
    loadBalancer: Option[software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer] = None,
    taskImageOptions: Option[software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageOptions] = None,
    taskSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    taskDefinition: Option[software.amazon.awscdk.services.ecs.FargateTaskDefinition] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    deploymentController: Option[software.amazon.awscdk.services.ecs.DeploymentController] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    listenerPort: Option[Number] = None,
    cloudMapOptions: Option[software.amazon.awscdk.services.ecs.CloudMapOptions] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedFargateService =
    software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedFargateService.Builder
      .create(stackCtx, internalResourceId)
      .healthCheckGracePeriod(healthCheckGracePeriod.orNull)
      .platformVersion(platformVersion.orNull)
      .targetProtocol(targetProtocol.orNull)
      .desiredCount(desiredCount.orNull)
      .serviceName(serviceName.orNull)
      .sslPolicy(sslPolicy.orNull)
      .circuitBreaker(circuitBreaker.orNull)
      .publicLoadBalancer(publicLoadBalancer.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .openListener(openListener.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .protocol(protocol.orNull)
      .minHealthyPercent(minHealthyPercent.orNull)
      .protocolVersion(protocolVersion.orNull)
      .recordType(recordType.orNull)
      .certificate(certificate.orNull)
      .memoryLimitMiB(memoryLimitMiB.orNull)
      .domainZone(domainZone.orNull)
      .domainName(domainName.orNull)
      .maxHealthyPercent(maxHealthyPercent.orNull)
      .cluster(cluster.orNull)
      .assignPublicIp(assignPublicIp.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .redirectHttp(redirectHttp.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .propagateTags(propagateTags.orNull)
      .enableEcsManagedTags(enableEcsManagedTags.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .loadBalancerName(loadBalancerName.orNull)
      .cpu(cpu.orNull)
      .loadBalancer(loadBalancer.orNull)
      .taskImageOptions(taskImageOptions.orNull)
      .taskSubnets(taskSubnets.orNull)
      .taskDefinition(taskDefinition.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .deploymentController(deploymentController.orNull)
      .vpc(vpc.orNull)
      .listenerPort(listenerPort.orNull)
      .cloudMapOptions(cloudMapOptions.orNull)
      .build()
}
