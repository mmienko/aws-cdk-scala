package io.burkard.cdk.services.kendra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object WebCrawlerSeedUrlConfigurationProperty {

  def apply(
    seedUrls: List[String],
    webCrawlerMode: Option[String] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerSeedUrlConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerSeedUrlConfigurationProperty.Builder)
      .seedUrls(seedUrls.asJava)
      .webCrawlerMode(webCrawlerMode.orNull)
      .build()
}
