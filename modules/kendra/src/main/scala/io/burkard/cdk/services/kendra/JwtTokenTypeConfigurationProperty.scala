package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object JwtTokenTypeConfigurationProperty {

  def apply(
    keyLocation: String,
    groupAttributeField: Option[String] = None,
    url: Option[String] = None,
    claimRegex: Option[String] = None,
    issuer: Option[String] = None,
    userNameAttributeField: Option[String] = None,
    secretManagerArn: Option[String] = None
  ): software.amazon.awscdk.services.kendra.CfnIndex.JwtTokenTypeConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnIndex.JwtTokenTypeConfigurationProperty.Builder)
      .keyLocation(keyLocation)
      .groupAttributeField(groupAttributeField.orNull)
      .url(url.orNull)
      .claimRegex(claimRegex.orNull)
      .issuer(issuer.orNull)
      .userNameAttributeField(userNameAttributeField.orNull)
      .secretManagerArn(secretManagerArn.orNull)
      .build()
}
