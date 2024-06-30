val scalaVersion = "2.13.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "vscodedemo",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scalaVersion,
    libraryDependencies += "io.github.cibotech" %% "evilplot" % "0.9.0"
  )
