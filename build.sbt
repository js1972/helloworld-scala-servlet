// see https://github.com/siasia/xsbt-web-plugin for more information on the
// jetty plugin

// import web settings
seq(webSettings :_*)

port in container.Configuration := 8081

name := "helloworld"

version := "1.0"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  // libraries for Jetty Container:
  //"org.eclipse.jetty" % "jetty-webapp" % "9.1.0.v20131115" % "container",
  //"javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided"
  //
  // libraries for Tomcat container:
  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided",
  "org.apache.tomcat.embed"% "tomcat-embed-core"% "7.0.40"% "container",
  "org.apache.tomcat.embed"% "tomcat-embed-logging-juli"% "7.0.40"% "container",
  "org.apache.tomcat.embed"% "tomcat-embed-jasper"% "7.0.40"% "container"
)
