resolvers += Resolver.bintrayRepo("bogdanromanx", "maven") // required until sbt-bintray is released
resolvers += Resolver.bintrayRepo("bbp", "nexus-releases")

addSbtPlugin("ch.epfl.bluebrain.nexus" % "sbt-nexus"           % "0.6.0")
addSbtPlugin("ch.epfl.bluebrain.nexus" % "sbt-nexus-workbench" % "0.2.2")
