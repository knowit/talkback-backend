organization := "io.github.knowit"
name := "talkback-backend"
version := "0.0.1-SNAPSHOT"
scalaVersion := "2.12.4"

val Http4sVersion = "0.17.6"
val Specs2Version = "4.0.2"
val LogbackVersion = "1.2.3"
val CatsVersion = "1.0.1"
val CatsEffectVersion = "0.8"
val Fs2Version = "0.10.0-RC1"

scalacOptions += "-Ypartial-unification"

libraryDependencies ++= Seq(
  "org.http4s"           %% "http4s-blaze-server"  % Http4sVersion,
  "org.http4s"           %% "http4s-circe"         % Http4sVersion,
  "org.http4s"           %% "http4s-dsl"           % Http4sVersion,
  "org.typelevel"        %% "cats-core"            % CatsVersion,
  "org.typelevel"        %% "cats-effect"          % CatsEffectVersion,
  "co.fs2"               %% "fs2-core"             % Fs2Version,
  "org.specs2"           %% "specs2-core"          % Specs2Version % "test",
  "ch.qos.logback"       %  "logback-classic"      % LogbackVersion
)

