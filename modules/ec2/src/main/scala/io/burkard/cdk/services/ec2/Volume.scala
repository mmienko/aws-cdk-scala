package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Volume {

  def apply(
    internalResourceId: String,
    availabilityZone: String,
    enableMultiAttach: Option[Boolean] = None,
    size: Option[software.amazon.awscdk.Size] = None,
    volumeType: Option[software.amazon.awscdk.services.ec2.EbsDeviceVolumeType] = None,
    encrypted: Option[Boolean] = None,
    iops: Option[Number] = None,
    encryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    autoEnableIo: Option[Boolean] = None,
    volumeName: Option[String] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None,
    snapshotId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.Volume =
    software.amazon.awscdk.services.ec2.Volume.Builder
      .create(stackCtx, internalResourceId)
      .availabilityZone(availabilityZone)
      .enableMultiAttach(enableMultiAttach.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .size(size.orNull)
      .volumeType(volumeType.orNull)
      .encrypted(encrypted.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .iops(iops.orNull)
      .encryptionKey(encryptionKey.orNull)
      .autoEnableIo(autoEnableIo.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .volumeName(volumeName.orNull)
      .removalPolicy(removalPolicy.orNull)
      .snapshotId(snapshotId.orNull)
      .build()
}
