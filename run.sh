#!/bin/bash
set -e
tomcatdown
mvn clean install
rm -r /opt/tomcat/apache-tomcat-8.5.53/webapps/SpringExample
cp -r /home/vikas/Downloads/SpringExample/target/SpringExample /opt/tomcat/apache-tomcat-8.5.53/webapps
