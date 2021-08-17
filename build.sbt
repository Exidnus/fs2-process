lazy val root = (project in file("."))
  .settings(
    name := "fs2-process",
    scalaVersion := "2.13.6",
    crossScalaVersions := List("2.13.6", "2.12.10"),
    organization := "eu.monniot",
    homepage := Some(url("https://github.com/fmonniot/fs2-process")),
    licenses := List("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0")),
    developers := List(
      Developer(
        "fmonniot",
        "François Monniot",
        "francoismonniot@gmail.com",
        url("https://francois.monniot.eu")
      )
    ),
    libraryDependencies ++= Seq(
      "co.fs2"                 %% "fs2-core"                      % "2.2.2",
      "com.zaxxer"             % "nuprocess"                      % "2.0.2",
      "org.scala-lang.modules" %% "scala-collection-compat"       % "2.1.3",
      "org.scalatest"          %% "scalatest"                     % "3.1.0" % Test,
      "org.scalacheck"         %% "scalacheck"                    % "1.14.3" % Test,
      "com.codecommit"         %% "cats-effect-testing-scalatest" % "0.4.0" % Test
    ),
    addCompilerPlugin(("org.typelevel" %% "kind-projector" % "0.13.0").cross(CrossVersion.full)),
    addCompilerPlugin("com.olegpy" %% "better-monadic-for" % "0.3.1")
  )
