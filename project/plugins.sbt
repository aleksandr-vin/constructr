

addSbtPlugin("com.dwijnand"      % "sbt-travisci"  % "1.1.1")
addSbtPlugin("com.jsuereth"      % "sbt-pgp"       % "1.1.0")
addSbtPlugin("com.lucidchart"    % "sbt-scalafmt"  % "1.14")
addSbtPlugin("com.typesafe.sbt"  % "sbt-git"       % "0.9.3")
addSbtPlugin("com.typesafe.sbt"  % "sbt-multi-jvm" % "0.4.0")
addSbtPlugin("de.heikoseeberger" % "sbt-header"    % "3.0.2")
//addSbtPlugin("org.foundweekends" % "sbt-bintray"   % "0.5.1")

libraryDependencies += "org.slf4j" % "slf4j-nop" % "1.7.25"  // Needed by sbt-git

resolvers += "Knoopje Releases" at "https://repo.knoopje.com/repository/sbt-plugins/"
credentials ++= Seq(Credentials(Path.userHome / ".ivy2" / ".credentials"))
