# Steps taken
1. `sudo apt-get install openjfx`
2. In IntelliJ IDEA:
    * File -> Project Structure
    * Remove the JDK and recreate it, to make sure the classpath includes the 
      new JavaFX jars
    * Make sure the module is targeting Java 8