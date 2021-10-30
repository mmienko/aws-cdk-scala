import sbt._
import sbt.Keys._

object ProjectPlugin extends AutoPlugin {
  val autoImport: ThingsToAutoImport.type = ThingsToAutoImport

  override val trigger: PluginTrigger = AllRequirements

  override val buildSettings: Seq[Def.Setting[_]] = Seq(
    organization := "io.burkard",
    organizationName := "burkard",
    scmInfo := Some(
      ScmInfo(
        url("https://github.com/NickBurkard/aws-cdk-scala"),
        "scm:git@github.com:NickBurkard/aws-cdk-scala.git"
      )
    ),
    developers := List(
      Developer(
        id = "NickBurkard",
        name = "Nick Burkard",
        email = "burkard.foss@gmail.com",
        url = url("https://burkard.io")
      )
    ),
    description := "Scala DSL for AWS CDK v2",
    licenses := List("Apache 2" -> url("https://github.com/NickBurkard/aws-cdk-scala/blob/master/LICENSE.txt")),
    homepage := Some(url("https://github.com/NickBurkard/aws-cdk-scala")),
    scalaVersion := "2.13.6"
  )

  object ThingsToAutoImport {

    final implicit class ProjectOps(private val project: Project) extends AnyVal {

      def withCdk(): Project =
        project.settings(
          libraryDependencies ++= Seq(
            Dependencies.Aws.cdk,
            Dependencies.Aws.constructs
          )
        )

      def withGuava(): Project =
        project.settings(libraryDependencies += Dependencies.Google.guava)

      def disablePublishing(): Project =
        project.settings(
          publish / skip := true,
          publishArtifact := false
        )

      def enablePublishing(): Project =
        project.settings(
          pomIncludeRepository := { _ => false },
          publishTo := Some(
            if (isSnapshot.value) "snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
            else "releases" at "https://oss.sonatype.org/service/local/staging/deploy/maven2"
          ),
          publishMavenStyle := true,
        )
    }
  }
}
