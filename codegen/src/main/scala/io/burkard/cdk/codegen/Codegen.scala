package io.burkard.cdk.codegen

import scala.jdk.CollectionConverters._

import com.google.common.reflect.ClassPath

object Codegen {
  def main(args: Array[String]): Unit =
    codegen()

  private[this] def codegen(): Unit =
    ClassPath
      .from(ClassLoader.getSystemClassLoader)
      .getAllClasses
      .asScala
      .toList
      // Collect classes per AWS service.
      .collect { classInfo =>
        classInfo.getPackageName match {
          // Resource for some service.
          case ServiceRegex(_, name) =>
            name -> classInfo

          // Shared resources are considered `core`.
          case CoreRegex() =>
            "core" -> classInfo
        }
      }
      .groupBy(_._1)
      // Load each service's classes, identifying builders.
      .map { case (name, classInfo) =>
        name -> classInfo.map(_._2.load()).flatMap(CdkBuilder.build(name))
      }
      .toList
      // Generate code for each service in order.
      .sortBy(_._1)
      .foreach { case (name, builders) =>
        println(name)
        builders.foreach(_.writeToSource())
      }
}
