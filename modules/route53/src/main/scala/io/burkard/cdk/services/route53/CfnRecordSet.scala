package io.burkard.cdk.services.route53

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRecordSet {

  def apply(
    internalResourceId: String,
    name: String,
    `type`: String,
    geoLocation: Option[software.amazon.awscdk.services.route53.CfnRecordSet.GeoLocationProperty] = None,
    weight: Option[Number] = None,
    healthCheckId: Option[String] = None,
    aliasTarget: Option[software.amazon.awscdk.services.route53.CfnRecordSet.AliasTargetProperty] = None,
    hostedZoneId: Option[String] = None,
    setIdentifier: Option[String] = None,
    multiValueAnswer: Option[Boolean] = None,
    hostedZoneName: Option[String] = None,
    comment: Option[String] = None,
    resourceRecords: Option[List[String]] = None,
    region: Option[String] = None,
    failover: Option[String] = None,
    ttl: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53.CfnRecordSet =
    software.amazon.awscdk.services.route53.CfnRecordSet.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .`type`(`type`)
      .geoLocation(geoLocation.orNull)
      .weight(weight.orNull)
      .healthCheckId(healthCheckId.orNull)
      .aliasTarget(aliasTarget.orNull)
      .hostedZoneId(hostedZoneId.orNull)
      .setIdentifier(setIdentifier.orNull)
      .multiValueAnswer(multiValueAnswer.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .hostedZoneName(hostedZoneName.orNull)
      .comment(comment.orNull)
      .resourceRecords(resourceRecords.map(_.asJava).orNull)
      .region(region.orNull)
      .failover(failover.orNull)
      .ttl(ttl.orNull)
      .build()
}
