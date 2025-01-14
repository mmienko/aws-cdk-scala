package io.burkard.cdk.services.stepfunctions

sealed abstract class CloudWatchAlarmUnit(val underlying: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit)
  extends Product
    with Serializable

object CloudWatchAlarmUnit {
  implicit def toAws(value: CloudWatchAlarmUnit): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit =
    Option(value).map(_.underlying).orNull

  case object Bits
    extends CloudWatchAlarmUnit(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.BITS)

  case object BitsPerSecond
    extends CloudWatchAlarmUnit(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.BITS_PER_SECOND)

  case object Bytes
    extends CloudWatchAlarmUnit(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.BYTES)

  case object BytesPerSecond
    extends CloudWatchAlarmUnit(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.BYTES_PER_SECOND)

  case object Count
    extends CloudWatchAlarmUnit(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.COUNT)

  case object CountPerSecond
    extends CloudWatchAlarmUnit(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.COUNT_PER_SECOND)

  case object GigaBits
    extends CloudWatchAlarmUnit(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.GIGA_BITS)

  case object GigaBitsPerSecond
    extends CloudWatchAlarmUnit(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.GIGA_BITS_PER_SECOND)

  case object GigaBytes
    extends CloudWatchAlarmUnit(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.GIGA_BYTES)

  case object GigaBytesPerSecond
    extends CloudWatchAlarmUnit(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.GIGA_BYTES_PER_SECOND)

  case object KiloBits
    extends CloudWatchAlarmUnit(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.KILO_BITS)

  case object KiloBitsPerSecond
    extends CloudWatchAlarmUnit(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.KILO_BITS_PER_SECOND)

  case object KiloBytes
    extends CloudWatchAlarmUnit(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.KILO_BYTES)

  case object KiloBytesPerSecond
    extends CloudWatchAlarmUnit(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.KILO_BYTES_PER_SECOND)

  case object MegaBits
    extends CloudWatchAlarmUnit(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.MEGA_BITS)

  case object MegaBitsPerSecond
    extends CloudWatchAlarmUnit(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.MEGA_BITS_PER_SECOND)

  case object MegaBytes
    extends CloudWatchAlarmUnit(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.MEGA_BYTES)

  case object MegaBytesPerSecond
    extends CloudWatchAlarmUnit(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.MEGA_BYTES_PER_SECOND)

  case object MicroSeconds
    extends CloudWatchAlarmUnit(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.MICRO_SECONDS)

  case object MilliSeconds
    extends CloudWatchAlarmUnit(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.MILLI_SECONDS)

  case object None
    extends CloudWatchAlarmUnit(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.NONE)

  case object Percent
    extends CloudWatchAlarmUnit(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.PERCENT)

  case object Seconds
    extends CloudWatchAlarmUnit(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.SECONDS)

  case object TeraBits
    extends CloudWatchAlarmUnit(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.TERA_BITS)

  case object TeraBitsPerSecond
    extends CloudWatchAlarmUnit(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.TERA_BITS_PER_SECOND)

  case object TeraBytes
    extends CloudWatchAlarmUnit(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.TERA_BYTES)

  case object TeraBytesPerSecond
    extends CloudWatchAlarmUnit(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.TERA_BYTES_PER_SECOND)
}
