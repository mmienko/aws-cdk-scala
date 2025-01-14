package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HttpApiDomainConfigurationProperty {

  def apply(
    domainName: String,
    certificateArn: String,
    basePath: Option[String] = None,
    mutualTlsAuthentication: Option[software.amazon.awscdk.services.sam.CfnHttpApi.MutualTlsAuthenticationProperty] = None,
    endpointConfiguration: Option[String] = None,
    securityPolicy: Option[String] = None,
    route53: Option[software.amazon.awscdk.services.sam.CfnHttpApi.Route53ConfigurationProperty] = None
  ): software.amazon.awscdk.services.sam.CfnHttpApi.HttpApiDomainConfigurationProperty =
    (new software.amazon.awscdk.services.sam.CfnHttpApi.HttpApiDomainConfigurationProperty.Builder)
      .domainName(domainName)
      .certificateArn(certificateArn)
      .basePath(basePath.orNull)
      .mutualTlsAuthentication(mutualTlsAuthentication.orNull)
      .endpointConfiguration(endpointConfiguration.orNull)
      .securityPolicy(securityPolicy.orNull)
      .route53(route53.orNull)
      .build()
}
