import sbt.Keys.libraryDependencies

name := "scalajs-sandpit"

version := "0.1"

scalaVersion  in ThisBuild := "2.12.4"


lazy val root = project
  .in(file(".")).
  aggregate(sjsJS, sjsJVM).
  settings(
    publish := {},
    publishLocal := {}
  )

lazy val sjs = crossProject.crossType(CrossType.Full).in(file(".")).
  settings(
    name := "scalajs-sandpit",
    version := "0.1-SNAPSHOT",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.1" % "test"
    )
  )
  .jvmSettings(
    libraryDependencies += "org.scala-js" %% "scalajs-stubs" % scalaJSVersion % "provided"

  ).
  jsSettings(

  )


lazy val sjsJVM = sjs.jvm
lazy val sjsJS = sjs.js
