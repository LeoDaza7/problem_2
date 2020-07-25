# problem_2

### Description

The application has the objective of calculate the distance between a student, and his classroom using coordinates.
To determine if the student is inside the classroom.

### CLI deploy

Please run the following commands on a CLI open at the root directory of the project.

Run the following commands:

```shell script
mvn clean package
mvn test
```

### IDE deploy

First please add `Problem2ApplicationTest` class to the Run/Debug configurations.
Then install the Lombok plugin in your preferred IDE.

#### IntelliJ IDEA
```text
Go to File > Settings > Plugins
Click on Browse repositories...
Search for Lombok Plugin
Click on Install plugin
Restart IntelliJ IDEA
```

#### Visual Studio Code
```text
press Ctrl + Shift + X to open the extension manager.
Type lombok to find the plugin, and click install.
Reload VS Code when asked.
```

#### Eclipse
```text
Double-click lombok.jar (downloadable from this site, or from your maven repository; it's the same jar). 
This starts the eclipse installer which will find eclipse (and eclipse variants as listed above),
and offers to install lombok into these eclipse installations.
```

### Reference Documentation

This is a Java 8 Maven based Application using lombok and JUnit dependencies.

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Lombok](https://projectlombok.org/)
* [JUnit](https://mvnrepository.com/artifact/junit/junit)

This uses the *Haversine* formula to calculate the great-circle distance between two points – that is, the shortest distance over the earth’s surface distance between the points.

* [Haversine Formula](https://www.movable-type.co.uk/scripts/latlong.html)
