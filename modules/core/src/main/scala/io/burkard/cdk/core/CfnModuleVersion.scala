package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnModuleVersion {

  def apply(
    internalResourceId: String,
    moduleName: Option[String] = None,
    modulePackage: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.CfnModuleVersion =
    software.amazon.awscdk.CfnModuleVersion.Builder
      .create(stackCtx, internalResourceId)
      .moduleName(moduleName.orNull)
      .modulePackage(modulePackage.orNull)
      .build()
}