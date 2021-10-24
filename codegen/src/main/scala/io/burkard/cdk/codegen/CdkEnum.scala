package io.burkard.cdk.codegen

import java.nio.file.{Path, Paths}

import scala.util.Try

import com.google.common.base.CaseFormat

// Enum provided by the CDK.
final case class CdkEnum private(
  serviceName: String,
  instanceCanonicalName: String,
  instanceSimpleName: String,
  valueNames: List[String],
  underlying: Class[_]
) {
  lazy val packageName: String = renamePackage(underlying.getPackageName)

  lazy val valuesCases: List[String] =
    valueNames.map { valueName =>
      s"""case object ${CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, valueName)}
         |    extends $instanceSimpleName($instanceCanonicalName.$valueName)""".stripMargin
    }
}

object CdkEnum {

  implicit val sourceGenerator: SourceGenerator[CdkEnum] =
    new SourceGenerator[CdkEnum] {
      override def path(source: CdkEnum): Path =
        Paths.get(
          s"aws-cdk-scala-${source.serviceName}",
          s"src/main/scala/${source.packageName.replace(".", "/")}/${source.instanceSimpleName}.scala".split("/"): _*
        )

      override def gen(source: CdkEnum): String =
        s"""package ${source.packageName}
           |
           |sealed abstract class ${source.instanceSimpleName}(val underlying: ${source.instanceCanonicalName})
           |  extends Product
           |    with Serializable
           |
           |object ${source.instanceSimpleName} {
           |  implicit def toAws(value: ${source.instanceSimpleName}): ${source.instanceCanonicalName} =
           |    Option(value).map(_.underlying).orNull
           |
           |  ${source.valuesCases.mkString("\n\n  ")}
           |}
           |""".stripMargin
    }

  def build(serviceName: String, underlying: Class[_]): Option[CdkEnum] =
    if (underlying.isEnum) {
      Try(
        underlying
          .getMethod("values")
          .invoke(null)
          .asInstanceOf[Array[_]]
          .toList
          .map(_.toString)
      )
        .toOption
        .map(
          CdkEnum(
            serviceName,
            underlying.getCanonicalName,
            underlying.getSimpleName,
            _,
            underlying
          )
        )
    } else {
      None
    }
}