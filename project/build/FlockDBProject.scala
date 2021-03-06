import sbt._
import Process._
import com.twitter.sbt.{SubversionRepository, StandardProject}


class FlockDBProject(info: ProjectInfo) extends StandardProject(info) with SubversionRepository {
  val asm       = "asm" % "asm" %  "1.5.3"
  val cglib     = "cglib" % "cglib" % "2.1_3"
  val configgy  = "net.lag" % "configgy" % "1.5.2"
  val dbcp      = "commons-dbcp" % "commons-dbcp" % "1.2.2"
  val gizzard   = "com.twitter" % "gizzard" % "1.1.3"
  val hamcrest  = "org.hamcrest" % "hamcrest-all" % "1.1"
  val jmock     = "org.jmock" % "jmock" % "2.4.0"
  val kestrel   = "net.lag" % "kestrel" % "1.2"
  val mysqljdbc = "mysql" % "mysql-connector-java" % "5.1.6"
  val objenesis = "org.objenesis" % "objenesis" % "1.1"
  val ostrich   = "com.twitter" % "ostrich" % "1.1.21"
  val pool      = "commons-pool" % "commons-pool" % "1.3"
  val querulous = "com.twitter" % "querulous" % "1.1.11"
  val results   = "com.twitter" % "results" % "1.0"
  val slf4j     = "org.slf4j" % "slf4j-jdk14" % "1.5.2"
  val slf4jApi  = "org.slf4j" % "slf4j-api" % "1.5.2"
  val smile     = "net.lag" % "smile" % "0.8.11"
  val specs     = "org.scala-tools.testing" % "specs" % "1.6.2.1"
  val thrift    = "thrift" % "libthrift" % "0.2.0"
  val xrayspecs = "com.twitter" % "xrayspecs" % "1.0.7"
  val log4j     = "log4j" % "log4j" % "1.2.12"
}
