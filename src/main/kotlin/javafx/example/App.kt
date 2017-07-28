package javafx.example

import javafx.application.Application
import javafx.application.Application.launch
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.layout.VBox
import javafx.stage.Stage

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