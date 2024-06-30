val myScalaVersion = "2.13.11"

lazy val root = project
  .in(file("."))
  .settings(
    name := "vscodedemo",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := myScalaVersion,
    libraryDependencies ++= Seq(
      "io.github.cibotech" %% "evilplot" % "0.9.0",
      "org.apache.xmlgraphics" % "batik-transcoder" % "1.14",  // For exporting SVG and PNG
      "org.apache.xmlgraphics" % "batik-codec" % "1.14"        // For exporting PNG
    )
  )
