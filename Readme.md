Getting Started

Using JMH is easy.

Install Java JDK on your platform (8+)

Mac OSX
using Homebrew

brew cask install java
 
http://www.oracle.com/technetwork/java/javase/downloads/index.html

Linux
sudo apt-get install openjdk-8-jdk 

OR you can find the tars here too

http://www.oracle.com/technetwork/java/javase/downloads/index.html

test by running
"javac -version" in your terminal

Install maven

Globally

Linux
sudo apt-get install maven 
Mac OSX

Usoinf Homebrew
brew install maven

Locally
Mac OSX, Linux & Windows

You can install just unpack maven into your project folder
http://maven.apache.org/download.cgi 

Write your benchmarking file and save it here:

Example:
Code

Benchmarking decorations documentation

Run mvn clean install

a JAR will be generated here:

Run the jar file with the following command

Enable JSON output by adding the --json flag to your command or run:

Visualise your JSON here: https://jmh.morethan.io/  
![jmh-visualised](https://user-images.githubusercontent.com/17616211/45848849-db92b800-bd27-11e8-9398-76fbf3986e57.png)

Visualiser Source: https://github.com/jzillmann/jmh-visualizer




With thanks to:
jzillmann

Baeldung
https://www.baeldung.com/java-microbenchmark-harness

Jenkov
http://tutorials.jenkov.com/java-performance/jmh.html 
