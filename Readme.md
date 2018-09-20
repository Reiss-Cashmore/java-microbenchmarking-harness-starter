# Getting Started
Using JMH is easy!

## 1. Install Java JDK on your platform (Version 8+)  
**Using the terminal to install the JDK globally**  
  
**Mac OSX** with Homebrew*  
```
brew cask install java
```

**Linux**  
```
sudo apt-get install openjdk-8-jdk
```  

## OR 
### Download the Tar files and install manually  
**For Linux, Mac OSX and Windows**  
http://www.oracle.com/technetwork/java/javase/downloads/index.html

***

> Validate you have installed the JDK correctly by running the following in your terminal:
```
javac -version
```  

## 2. Installing maven

### Using the terminal to install maven globally
  
**Mac OSX** with Homebrew*  
```
brew install maven
```

**Linux**  
```
sudo apt-get install maven
```  

### Local install using the maven package  
  
**Mac OSX, Linux & Windows**  
  
You can just download and unpack maven into your project folder, either run the `mvn` from within the `/bin/` directory of the package or add a PATH variable/alias so that you can use the `mvn` command easily  
**Maven Package Download:** http://maven.apache.org/download.cgi  
**Install Instructions:** https://maven.apache.org/install.html

## 3. Compile benchmarks  
**Run:**  
```
mvn clean install
```  
**This will generate a benchmarks.jar in: /target**

## 4. Run the benchmarks  
**Run the following command**
```
java -jar target/benchmarks.jar
```
Enable JSON output by adding the --json flag to your command or run:  
```
java -jar benchmarks.jar -rf json
```

> You can export your benchmark to other formats, to see them run: `java -jar benchmarks.jar -lrf`


# For more information check out the wiki:  
### [Writing A Benchmark](https://github.com/Reiss-Cashmore/java-microbenchmarking-harness-starter/wiki/Writing-A-Benchmark)  
### [Useful Articles](https://github.com/Reiss-Cashmore/java-microbenchmarking-harness-starter/wiki/Useful-Articles)  
### [Visualising Benchmarks](https://github.com/Reiss-Cashmore/java-microbenchmarking-harness-starter/wiki/Visualising-Benchmarks)  
### [Benchmarking Decorators](https://github.com/Reiss-Cashmore/java-microbenchmarking-harness-starter/wiki/Benchmarking-Decorators)  

# Visualise your JSON benchmark output: 
https://jmh.morethan.io/  
![jmh-visualised](https://user-images.githubusercontent.com/17616211/45848849-db92b800-bd27-11e8-9398-76fbf3986e57.png)


## With thanks to:
**jzillmann**
https://github.com/jzillmann/  
**Baeldung**
https://www.baeldung.com/java-microbenchmark-harness  
**jenkov**
http://tutorials.jenkov.com/java-performance/jmh.html 
