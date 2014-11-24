import sbt._
import Keys._
import sbt._


object Version {
  val specs2 = "2.4.11"
}

object Library {
  val specs2 = "org.specs2" %% "specs2-core" % Version.specs2
}

object Dependencies {
  import Library._
  val scala99Problems = Seq(
    specs2 % "test"
  )
}

