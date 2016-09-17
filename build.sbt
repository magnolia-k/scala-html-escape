name := "scala-html-escape"

version := "0.1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq("org.specs2" % "specs2-core_2.11" % "3.8.5" % "test")

scalacOptions in Test ++= Seq("-Yrangepos")
