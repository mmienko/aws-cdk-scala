package io.burkard.cdk.codegen

import java.nio.file.{Path, Paths}

import scala.util.Try

import com.google.common.base.CaseFormat

// Enum provided by the CDK.
final case class CdkEnum private[codegen](
  serviceName: String,
  instanceCanonicalName: String,
  instanceSimpleName: String,
  valueNames: List[String],
  underlying: Class[_]
) {
  lazy val packageName: String = renamePackage(underlying.getPackageName)

  // `case object ValueName extends EnumName(underlyingValue)`.
  lazy val valuesCases: List[String] =
    valueNames.map { valueName =>
      s"""case object ${CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, valueName)}
         |    extends $instanceSimpleName($instanceCanonicalName.$valueName)""".stripMargin
    }

  lazy val noWarnClass: String =
    if (underlying.getAnnotations.toList.exists(_.annotationType().getSimpleName == "Deprecated")) {
      "\n@scala.annotation.nowarn(\"cat=deprecation\")"
    } else {
      ""
    }

  lazy val noWarnObject: String =
    if (valueNames.exists(isDeprecated)) {
      "\n@scala.annotation.nowarn(\"cat=deprecation\")"
    } else {
      ""
    }

  private[this] def isDeprecated(valueName: String): Boolean =
    Try(underlying.getField(valueName))
      .map(_.getAnnotations.toList.exists(_.annotationType().getSimpleName == "Deprecated"))
      .getOrElse(false)
}

object CdkEnum {

  implicit val sourceGenerator: SourceGenerator[CdkEnum] =
    new SourceGenerator[CdkEnum] {
      override def moduleName(source: CdkEnum): String =
        source.serviceName

      override def path(source: CdkEnum): Path =
        Paths.get(
          "modules",
          s"${moduleName(source)}/src/main/scala/${source.packageName.replaceAll("\\.", "/")}/${source.instanceSimpleName}.scala".split("/"): _*
        )

      override def gen(source: CdkEnum): String =
        s"""package ${source.packageName}
           |${source.noWarnClass}
           |sealed abstract class ${source.instanceSimpleName}(val underlying: ${source.instanceCanonicalName})
           |  extends Product
           |    with Serializable
           |${source.noWarnObject}
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