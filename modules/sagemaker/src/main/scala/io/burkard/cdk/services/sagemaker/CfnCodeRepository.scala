package io.burkard.cdk.services.sagemaker

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCodeRepository {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    codeRepositoryName: Option[String] = None,
    gitConfig: Option[software.amazon.awscdk.services.sagemaker.CfnCodeRepository.GitConfigProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sagemaker.CfnCodeRepository =
    software.amazon.awscdk.services.sagemaker.CfnCodeRepository.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .codeRepositoryName(codeRepositoryName.orNull)
      .gitConfig(gitConfig.orNull)
      .build()
}