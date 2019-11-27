package org.mshassium.tornado_fx.view

import org.mshassium.tornado_fx.styles.FXCalculatorStylesheet
import tornadofx.*

class CalculatorView : View("FXCalculator") {
    override val root = borderpane {
        addClass(FXCalculatorStylesheet.application)
        top = textfield {
            addClass(FXCalculatorStylesheet.resultLine)
        }
        center = flowpane {
            addClass(FXCalculatorStylesheet.controlBlock)
            button("AC") {
                addClass(FXCalculatorStylesheet.secondButton)
                addClass(FXCalculatorStylesheet.buttonFx)
            }
            button("±") {
                addClass(FXCalculatorStylesheet.secondButton)
                addClass(FXCalculatorStylesheet.buttonFx)
            }
            button("%") {
                addClass(FXCalculatorStylesheet.secondButton)
                addClass(FXCalculatorStylesheet.buttonFx)
            }

            button("÷") {
                addClass(FXCalculatorStylesheet.operationButton)
                addClass(FXCalculatorStylesheet.buttonFx)
            }
            button("7") {
                addClass(FXCalculatorStylesheet.numberButton)
                addClass(FXCalculatorStylesheet.buttonFx)
            }
            button("8") {
                addClass(FXCalculatorStylesheet.numberButton)
                addClass(FXCalculatorStylesheet.buttonFx)
            }
            button("9") {
                addClass(FXCalculatorStylesheet.numberButton)
                addClass(FXCalculatorStylesheet.buttonFx)
            }
            button("х") {
                addClass(FXCalculatorStylesheet.operationButton)
                addClass(FXCalculatorStylesheet.buttonFx)
            }
            button("4") {
                addClass(FXCalculatorStylesheet.numberButton)
                addClass(FXCalculatorStylesheet.buttonFx)
            }
            button("5") {
                addClass(FXCalculatorStylesheet.numberButton)
                addClass(FXCalculatorStylesheet.buttonFx)
            }
            button("6") {
                addClass(FXCalculatorStylesheet.numberButton)
                addClass(FXCalculatorStylesheet.buttonFx)

            }
            button("-") {
                addClass(FXCalculatorStylesheet.operationButton)
                addClass(FXCalculatorStylesheet.buttonFx)
            }
            button("1") {
                addClass(FXCalculatorStylesheet.numberButton)
                addClass(FXCalculatorStylesheet.buttonFx)
            }
            button("2") {
                addClass(FXCalculatorStylesheet.numberButton)
                addClass(FXCalculatorStylesheet.buttonFx)
            }
            button("3") {
                addClass(FXCalculatorStylesheet.numberButton)
                addClass(FXCalculatorStylesheet.buttonFx)
            }
            button("+") {
                addClass(FXCalculatorStylesheet.operationButton)
                addClass(FXCalculatorStylesheet.buttonFx)
            }
            button("0") {
                addClass(FXCalculatorStylesheet.numberButton)
                addClass(FXCalculatorStylesheet.buttonFx)
                addClass(FXCalculatorStylesheet.zeroAlign)
            }
            button(",") {
                addClass(FXCalculatorStylesheet.numberButton)
                addClass(FXCalculatorStylesheet.buttonFx)
            }
            button("=") {
                addClass(FXCalculatorStylesheet.operationButton)
                addClass(FXCalculatorStylesheet.buttonFx)
            }
        }
    }
}
