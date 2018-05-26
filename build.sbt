name := "ScalaTestExamples"

version := "0.1"

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.12" % "3.0.5" % "test",
  "org.mockito" % "mockito-core" % "2.18.3" % Test
)
