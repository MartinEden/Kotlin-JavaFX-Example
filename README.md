# Running
To run this application use `./gradlew jfxRun`.

# Install prerequisites
First, make sure you have JavaFX installed. I use OpenJDK on Ubuntu. OpenJDK 
ships with Ubuntu 16.04, but despite JavaFX being a part of the JRE, it doesn't 
ship with the standard OpenJDK package. Instead you should run:

```
sudo apt-get install openjfx
```

This will add JARs to `/usr/lib/jvm/<JAVA VERSION>/lib`.

## IntelliJ IDEA
I was using IntelliJ IDEA to develop and I discovered I had to do some 
additional steps to notice I had installed JavaFX:

1. In the newly created project, go to File → Project Structure
1. Remove the JDK and recreate it, to make sure the classpath includes the new JavaFX jars
1. Make sure the module is targeting Java 8
2. 
You may not have to do these steps - I created the project before installing 
JavaFX, which may have been the root of my problems.

# For more information
See [this blog post](http://functiontomymadness.blogspot.co.uk/2017/07/hello-world-in-javafx-with-kotlin-and.html)