name := "scala-99-problems"

version := "1.0"

scalaVersion := "2.11.4"

resolvers ++= Seq("snapshots", "releases").map(Resolver.sonatypeRepo)

scalacOptions in Test ++= Seq("-Yrangepos")

libraryDependencies ++= Dependencies.scala99Problems