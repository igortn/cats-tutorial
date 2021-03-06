name := "cats-tutorial"

version := "1.0"

scalaVersion := "2.12.4"

scalacOptions += "-Ypartial-unification"

resolvers += Resolver.sonatypeRepo("releases")

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)

addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.4")

libraryDependencies ++= Seq(
    "org.typelevel" %% "cats-core" % "1.0.1"
  , "org.typelevel" %% "cats-laws" % "1.0.1"
  , "org.typelevel" %% "cats-free" % "1.0.1"

  , "io.monix" %% "monix" % "2.3.0"
  , "io.monix" %% "monix-cats" % "2.3.0"

  , "org.scalatest" %% "scalatest" % "3.0.4" % "test"

  , "com.github.mpilquist" %% "simulacrum" % "0.11.0"
)


        