package javafx.example

import javafx.application.Application
import javafx.application.Application.launch
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.layout.VBox
import javafx.stage.Stage

// Note the the Gradle jfxRun task directly launches the JavaFxExample
// class, and bypasses this main function. This function exists so
// you can easily launch the application with a debugger attached.
fun main(args: Array<String>)
{
    launch(JavaFXExample::class.java)
}

class JavaFXExample : Application()
{
    override fun start(primaryStage: Stage)
    {
        val layout = VBox().apply {
            children.add(Label("Hello, World!"))
        }
        primaryStage.run {
            scene = Scene(layout)
            show()
        }
    }
}