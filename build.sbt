package com.come


val scala3Version = "2.13"

lazy val root = project
  .in(file("."))
  .settings(
    name := "vscodedemo",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
  libraryDependencies += "io.github.cibotech" %% "evilplot" % "0.9.0"
  )
