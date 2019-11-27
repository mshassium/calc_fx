package org.mshassium.tornado_fx.view

import javafx.scene.layout.BorderPane
import tornadofx.View

class CalculatorViewFxml : View("FXCalculatorFXML") {
    override val root : BorderPane by fxml("/config/calculator.fxml")
}
