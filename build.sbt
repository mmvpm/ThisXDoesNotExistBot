version in Global := "0.1"
scalaVersion in Global := "2.12.13"

lazy val root = project.in(file("."))
    .settings(
        name := "ThisXDoesNotExistBot",
        run := run.in(Compile, run).evaluated,
        libraryDependencies += "com.bot4s" %% "telegram-core" % "4.4.0-RC2",
        libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.5" % Test
    )