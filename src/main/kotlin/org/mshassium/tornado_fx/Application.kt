package org.mshassium.tornado_fx

import javafx.stage.Stage
import org.mshassium.tornado_fx.styles.FXCalculatorStylesheet
import org.mshassium.tornado_fx.view.CalculatorView
import org.mshassium.tornado_fx.view.CalculatorViewFxml
import tornadofx.App

class Application : App(CalculatorViewFxml::class, FXCalculatorStylesheet::class) {

    override fun start(stage: Stage) {
        stage.isResizable = false
        stage.width = 233.00
        stage.height = 320.00
        super.start(stage)
    }

}

