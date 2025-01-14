package io.burkard.cdk.cxapi

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KeyContextResponse {

  def apply(
    keyId: String
  ): software.amazon.awscdk.cxapi.KeyContextResponse =
    (new software.amazon.awscdk.cxapi.KeyContextResponse.Builder)
      .keyId(keyId)
      .build()
}
