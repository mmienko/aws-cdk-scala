package io.burkard.cdk.services.opensearchservice

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DomainProps {

  def apply(
    version: software.amazon.awscdk.services.opensearchservice.EngineVersion,
    tlsSecurityPolicy: Option[software.amazon.awscdk.services.opensearchservice.TLSSecurityPolicy] = None,
    useUnsignedBasicAuth: Option[Boolean] = None,
    customEndpoint: Option[software.amazon.awscdk.services.opensearchservice.CustomEndpointOptions] = None,
    nodeToNodeEncryption: Option[Boolean] = None,
    domainName: Option[String] = None,
    fineGrainedAccessControl: Option[software.amazon.awscdk.services.opensearchservice.AdvancedSecurityOptions] = None,
    accessPolicies: Option[List[_ <: software.amazon.awscdk.services.iam.PolicyStatement]] = None,
    enableVersionUpgrade: Option[Boolean] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    enforceHttps: Option[Boolean] = None,
    encryptionAtRest: Option[software.amazon.awscdk.services.opensearchservice.EncryptionAtRestOptions] = None,
    advancedOptions: Option[Map[String, String]] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None,
    capacity: Option[software.amazon.awscdk.services.opensearchservice.CapacityConfig] = None,
    zoneAwareness: Option[software.amazon.awscdk.services.opensearchservice.ZoneAwarenessConfig] = None,
    logging: Option[software.amazon.awscdk.services.opensearchservice.LoggingOptions] = None,
    cognitoDashboardsAuth: Option[software.amazon.awscdk.services.opensearchservice.CognitoOptions] = None,
    vpcSubnets: Option[List[_ <: software.amazon.awscdk.services.ec2.SubnetSelection]] = None,
    automatedSnapshotStartHour: Option[Number] = None,
    ebs: Option[software.amazon.awscdk.services.opensearchservice.EbsOptions] = None
  ): software.amazon.awscdk.services.opensearchservice.DomainProps =
    (new software.amazon.awscdk.services.opensearchservice.DomainProps.Builder)
      .version(version)
      .tlsSecurityPolicy(tlsSecurityPolicy.orNull)
      .useUnsignedBasicAuth(useUnsignedBasicAuth.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .customEndpoint(customEndpoint.orNull)
      .nodeToNodeEncryption(nodeToNodeEncryption.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .domainName(domainName.orNull)
      .fineGrainedAccessControl(fineGrainedAccessControl.orNull)
      .accessPolicies(accessPolicies.map(_.asJava).orNull)
      .enableVersionUpgrade(enableVersionUpgrade.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .vpc(vpc.orNull)
      .enforceHttps(enforceHttps.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .encryptionAtRest(encryptionAtRest.orNull)
      .advancedOptions(advancedOptions.map(_.asJava).orNull)
      .removalPolicy(removalPolicy.orNull)
      .capacity(capacity.orNull)
      .zoneAwareness(zoneAwareness.orNull)
      .logging(logging.orNull)
      .cognitoDashboardsAuth(cognitoDashboardsAuth.orNull)
      .vpcSubnets(vpcSubnets.map(_.asJava).orNull)
      .automatedSnapshotStartHour(automatedSnapshotStartHour.orNull)
      .ebs(ebs.orNull)
      .build()
}
