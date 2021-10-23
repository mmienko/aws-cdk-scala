import java.lang.reflect.{Method, Modifier}
import java.nio.charset.StandardCharsets
import java.nio.file.{Files, Paths}

// Class instance builder provided by the CDK.
final case class CdkBuilder private(
  serviceName: String,
  instanceCanonicalName: String,
  instanceSimpleName: String,
  underlying: Class[_],
  create: Method,
  build: Method
) {
  // [0, N] field methods of the underlying builder.
  lazy val fieldMethods: List[FieldMethod] =
    underlying
      .getMethods
      .toList
      .flatMap(FieldMethod.build)

  lazy val packageName: String =
    underlying
      .getPackageName
      .replace("software.amazon.awscdk", "io.burkard.cdk")

  lazy val parameters: List[String] =
    fieldMethods.map(_.asParameter)

  def codegen: String =
    s"""package $packageName
      |
      |object $instanceSimpleName {
      |  $applyMethodSignature = ???
      |}
      |""".stripMargin

  private[this] def applyMethodSignature: String =
    if (fieldMethods.nonEmpty) {
      s"""def apply(
         |    ${parameters.mkString(",\n    ")}
         |  ): $instanceCanonicalName""".stripMargin
    } else {
      s"def apply(): $instanceCanonicalName"
    }

  private[this] lazy val path =
    Paths.get(
      s"aws-cdk-scala-$serviceName",
      s"src/main/scala/${packageName.replace(".", "/")}/$instanceSimpleName.scala".split("/"): _*
    )

  def writeToSource(): Unit = {
    if (!Files.exists(path)) {
      Files.createDirectories(path.getParent)
      Files.createFile(path)
    }
    val _ = Files.write(path, codegen.getBytes(StandardCharsets.UTF_8))
  }
}

object CdkBuilder {
  // Using Java reflection to identify which CDK classes we can codegen.
  // Not using Scala reflection because of 2.x/3.x API differences.
  def build(serviceName: String)(underlying: Class[_]): Option[CdkBuilder] =
    if (underlying.getSimpleName == "Builder") {
      for {
        create <- createMethod(underlying)

        build <- buildMethod(underlying)

        instanceCanonicalName = underlying.getCanonicalName.split("\\.").toList.dropRight(1).mkString(".")

        instanceSimpleName <- instanceCanonicalName.split("\\.").toList.lastOption
      } yield CdkBuilder(serviceName, instanceCanonicalName, instanceSimpleName, underlying, create, build)
    } else {
      None
    }

  // public static Builder create(context, id)
  private[this] def createMethod(underlying: Class[_]): Option[Method] =
    underlying.getMethods
      .find(m => m.getName == "create" && Modifier.isStatic(m.getModifiers) && m.getParameterCount == 2)

  // public Underlying build()
  private[this] def buildMethod(underlying: Class[_]): Option[Method] =
    underlying.getMethods
      .find(m => m.getName == "build" && !Modifier.isStatic(m.getModifiers) && m.getParameterCount == 0)
}
