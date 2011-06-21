#!/bin/sh

#this way doesn't get the dependencies...
#java -cp target/standalone_test-0.0.1-SNAPSHOT.jar org.oldcode.freemarker.standalone_test.App

#args aren't used currently
mvn exec:java -Dexec.mainClass="org.oldcode.freemarker.standalone_test.App" -Dexec.args="arg0 arg1 arg2"  
