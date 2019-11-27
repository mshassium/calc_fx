package org.mshassium.tornado_fx.view

import org.mshassium.tornado_fx.styles.FXCalculatorStylesheet
import tornadofx.*

class CalculatorView : View("FXCalculator") {
    val MIN_WIDTH_BUTTON_1 = 56.5
    val MIN_WIDTH_BUTTON_2 = 61.0
    override val root = borderpane {
        addClass(FXCalculatorStylesheet.application)
        top = textfield  {
            filterInput { it.controlNewText.isInt() }
            addClass(FXCalculatorStylesheet.resultLine)
        }
        center = flowpane {
            addClass(FXCalculatorStylesheet.controlBlock)
            button("AC") {
                addClass(FXCalculatorStylesheet.secondButton)
                addClass(FXCalculatorStylesheet.buttonFx)
                styleProperty().set("-fx-background-radius:0")
                minWidth = MIN_WIDTH_BUTTON_1
                minHeight = 47.0
                setOnMousePressed {
                    addClass(FXCalculatorStylesheet.clickedButton)
                }
            }
            button("±") {
                addClass(FXCalculatorStylesheet.secondButton)
                addClass(FXCalculatorStylesheet.buttonFx)
                styleProperty().set("-fx-background-radius:0")
                minWidth = MIN_WIDTH_BUTTON_1
                minHeight = 47.0
            }
            button("%") {
                addClass(FXCalculatorStylesheet.secondButton)
                addClass(FXCalculatorStylesheet.buttonFx)
                styleProperty().set("-fx-background-radius:0")
                minWidth = MIN_WIDTH_BUTTON_1
                minHeight = 47.0
            }

            button("÷") {
                addClass(FXCalculatorStylesheet.operationButton)
                addClass(FXCalculatorStylesheet.buttonFx)
                styleProperty().set("-fx-background-radius:0")
                minWidth = MIN_WIDTH_BUTTON_2
                minHeight = 47.0
            }
            button("7") {
                addClass(FXCalculatorStylesheet.numberButton)
                addClass(FXCalculatorStylesheet.buttonFx)
                styleProperty().set("-fx-background-radius:0")
                minWidth = MIN_WIDTH_BUTTON_1
                minHeight = 47.0
            }
            button("8") {
                addClass(FXCalculatorStylesheet.numberButton)
                addClass(FXCalculatorStylesheet.buttonFx)
                styleProperty().set("-fx-background-radius:0")
                minWidth = MIN_WIDTH_BUTTON_1
                minHeight = 47.0
            }
            button("9") {
                addClass(FXCalculatorStylesheet.numberButton)
                addClass(FXCalculatorStylesheet.buttonFx)
                styleProperty().set("-fx-background-radius:0")
                minWidth = MIN_WIDTH_BUTTON_1
                minHeight = 47.0
            }
            button("х") {
                addClass(FXCalculatorStylesheet.operationButton)
                addClass(FXCalculatorStylesheet.buttonFx)
                styleProperty().set("-fx-background-radius:0")
                minWidth = MIN_WIDTH_BUTTON_2
                minHeight = 47.0
            }
            button("4") {
                addClass(FXCalculatorStylesheet.numberButton)
                addClass(FXCalculatorStylesheet.buttonFx)
                styleProperty().set("-fx-background-radius:0")
                minWidth = MIN_WIDTH_BUTTON_1
                minHeight = 47.0
            }
            button("5") {
                addClass(FXCalculatorStylesheet.numberButton)
                addClass(FXCalculatorStylesheet.buttonFx)
                styleProperty().set("-fx-background-radius:0")
                minWidth = MIN_WIDTH_BUTTON_1
                minHeight = 47.0
            }
            button("6") {
                addClass(FXCalculatorStylesheet.numberButton)
                addClass(FXCalculatorStylesheet.buttonFx)
                styleProperty().set("-fx-background-radius:0")
                minWidth = MIN_WIDTH_BUTTON_1
                minHeight = 47.0
            }
            button("-") {
                addClass(FXCalculatorStylesheet.operationButton)
                addClass(FXCalculatorStylesheet.buttonFx)
                styleProperty().set("-fx-background-radius:0")
                minWidth = MIN_WIDTH_BUTTON_2
                minHeight = 47.0
            }
            button("1") {
                addClass(FXCalculatorStylesheet.numberButton)
                addClass(FXCalculatorStylesheet.buttonFx)
                styleProperty().set("-fx-background-radius:0")
                minWidth = MIN_WIDTH_BUTTON_1
                minHeight = 47.0
            }
            button("2") {
                addClass(FXCalculatorStylesheet.numberButton)
                addClass(FXCalculatorStylesheet.buttonFx)
                styleProperty().set("-fx-background-radius:0")
                minWidth = MIN_WIDTH_BUTTON_1
                minHeight = 47.0
            }
            button("3") {
                addClass(FXCalculatorStylesheet.numberButton)
                addClass(FXCalculatorStylesheet.buttonFx)
                styleProperty().set("-fx-background-radius:0")
                minWidth = MIN_WIDTH_BUTTON_1
                minHeight = 47.0
            }
            button("+") {
                addClass(FXCalculatorStylesheet.operationButton)
                addClass(FXCalculatorStylesheet.buttonFx)
                styleProperty().set("-fx-background-radius:0")
                minWidth = MIN_WIDTH_BUTTON_2
                minHeight = 47.0
            }
            button("0") {
                addClass(FXCalculatorStylesheet.numberButton)
                addClass(FXCalculatorStylesheet.buttonFx)
                addClass(FXCalculatorStylesheet.zeroAlign)
                styleProperty().set("-fx-background-radius:0")
                minWidth = MIN_WIDTH_BUTTON_1 * 2 + 1.0
                minHeight = 47.0
            }
            button(",") {
                addClass(FXCalculatorStylesheet.numberButton)
                addClass(FXCalculatorStylesheet.buttonFx)
                styleProperty().set("-fx-background-radius:0")
                minWidth = MIN_WIDTH_BUTTON_1
                minHeight = 47.0
            }
            button("=") {
                addClass(FXCalculatorStylesheet.operationButton)
                addClass(FXCalculatorStylesheet.buttonFx)
                styleProperty().set("-fx-background-radius:0")
                minWidth = MIN_WIDTH_BUTTON_2
                minHeight = 47.0
            }
        }
    }
}
