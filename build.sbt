val Http4sVersion = "0.18.0-M7"
val Specs2Version = "4.0.0"
val H2Version = "1.4.196"
val doobieVersion = "0.5.0-M11"
val ScalaMockVersion = "4.0.0"
val LogbackVersion = "1.2.3"

lazy val root = (project in file("."))
  .settings(
    organization := "no.knowit.jvmchapter",
    name := "talkback",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := "2.12.4",
    libraryDependencies := Seq(
      "org.http4s" %% "http4s-blaze-server" % Http4sVersion,
      "org.http4s" %% "http4s-circe" % Http4sVersion,
      "org.http4s" %% "http4s-dsl" % Http4sVersion
    )
  )
