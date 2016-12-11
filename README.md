# RMI-Project
4th year Distributed systems project - An Asynchronous RMI String Comparison Service

###Before Starting
Ensure that you
Downloaded Java 8 SDK (At the very least) & Configured Eclipse to use Java 8 as the Runtime

Downloaded Eclipse Java EE IDE

Downloaded & Installed Tomcat 9 & Configured Eclipse to use Tomcat 9

###To Start

###Code Structure
My code is laid out in the WEB-INF folder of the WebContent (This is only in a dynamic web project) with ie/gmit and within that is 4 folders - RMI, ServiceHandler, string-algos and sw.
[![Screenshot.png](https://s28.postimg.org/j4q8x03od/Screenshot.png)](https://postimg.org/image/og55hppqx/)
####RMI
This folder holds all the classes that deal with the RMI interface and will be doing the bulk of the work by comparing the strings and adding them to a blocking queue and then to a map before finishing up and returning the result of the differences between the two strings
####ServiceHandler
Contains only the ServiceHandler.java
####string-algos
This folder contains the different string comparison algorithms that we will be using
####sw
Only contains the Servant who contacts the registry and does rebinding for the server

##References
http://stackoverflow.com/questions/1842734/how-to-asynchronously-call-a-method-in-java
http://javarevisited.blogspot.ie/2012/12/blocking-queue-in-java-example-ArrayBlockingQueue-LinkedBlockingQueue.html
https://docs.oracle.com/javase/7/docs/api/java/util/HashMap.html
http://docs.oracle.com/javase/7/docs/technotes/guides/rmi/hello/hello-world.html
