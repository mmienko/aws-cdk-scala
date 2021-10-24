package io.burkard.cdk

import scala.util.matching.Regex

package object codegen {
  // Service-based builders.
  // `.service` package is optional.
  val ServiceRegex: Regex = raw"^software\.amazon\.awscdk(\.services)?\.([a-z0-9]+).*".r

  // General builders, often shared between services.
  val CoreRegex: Regex = raw"^software\.amazon\.awscdk".r

  // Package rewrite rules in descending order of precedence.
  private[this] val packageRewrites: List[(Regex, Regex.Match => String)] =
    List(
      ServiceRegex -> { m =>
        if (m.group(1) == null) {
          s"io.burkard.cdk.${m.group(2)}"
        } else {
          s"io.burkard.cdk.services.${m.group(2)}"
        }
      },
      CoreRegex -> { _ => "io.burkard.cdk.core" }
    )

  // Potentially rename a package.
  def renamePackage(name: String): String =
    packageRewrites.foldLeft(name) { case (value, (regex, replacer)) =>
      regex.replaceAllIn(value, replacer)
    }

  private[this] val scala2ReservedWords: Set[String] =
    Set(
      "abstract", "case", "catch", "class", "def", "do", "else", "extends", "false", "final", "finally","for",
      "forSome", "if", "implicit", "import", "lazy", "match", "new", "null", "object", "override", "package",
      "private", "protected", "return", "sealed", "super", "this", "throw", "trait", "try", "true", "type",
      "val", "var", "while", "with", "yield"
    )

  def renameType(name: String): String =
    if (scala2ReservedWords.contains(name)) {
      s"`$name`"
    } else {
      name
    }

  final implicit class SourceGeneratorOps[A](private val source: A) extends AnyVal {
    def sourceFile(implicit sourceGenerator: SourceGenerator[A]): SourceFile =
      sourceGenerator.sourceFile(source)
  }
}