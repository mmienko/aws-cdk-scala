package io.burkard.cdk.services.secretsmanager

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SecretProps {

  def apply(
    replicaRegions: Option[List[_ <: software.amazon.awscdk.services.secretsmanager.ReplicaRegion]] = None,
    description: Option[String] = None,
    secretName: Option[String] = None,
    generateSecretString: Option[software.amazon.awscdk.services.secretsmanager.SecretStringGenerator] = None,
    encryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  ): software.amazon.awscdk.services.secretsmanager.SecretProps =
    (new software.amazon.awscdk.services.secretsmanager.SecretProps.Builder)
      .replicaRegions(replicaRegions.map(_.asJava).orNull)
      .description(description.orNull)
      .secretName(secretName.orNull)
      .generateSecretString(generateSecretString.orNull)
      .encryptionKey(encryptionKey.orNull)
      .removalPolicy(removalPolicy.orNull)
      .build()
}
