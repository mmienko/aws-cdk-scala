package io.burkard.cdk.services.cognito

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AccountRecoverySettingProperty {

  def apply(
    recoveryMechanisms: Option[List[_]] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPool.AccountRecoverySettingProperty =
    (new software.amazon.awscdk.services.cognito.CfnUserPool.AccountRecoverySettingProperty.Builder)
      .recoveryMechanisms(recoveryMechanisms.map(_.asJava).orNull)
      .build()
}
