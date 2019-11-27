package org.mshassium.tornado_fx.styles

import javafx.scene.paint.Color
import javafx.scene.text.TextAlignment
import tornadofx.*

class FXCalculatorStylesheet : Stylesheet() {

    companion object {
        val resultLine by cssclass()
        val controlBlock by cssclass()
        val secondButton by cssclass()
        val numberButton by cssclass()
        val operationButton by cssclass()
        val clickedButton by cssclass()
        val application by cssclass()
        val buttonFx by cssclass()
        val zeroAlign by cssclass()
        val mainColor = c(red = 39, green = 40, blue = 47)
        val secondColor = c(red = 61, green = 62, blue = 67)
        val numberColor = c(red = 92, green = 92, blue = 92)
        val clickedColor = c(red = 110, green = 110, blue = 110)
        val operationColor = c(red = 241, green = 135, blue = 13)
    }

    init {
        zeroAlign {
            textAlignment = TextAlignment.LEFT
        }
        resultLine {
            backgroundColor += mainColor
            padding = box(0.px)
            minWidth = 90.percent
            fontSize = 46.px
            borderRadius += box(0.px)
            borderColor += box(mainColor)
            textFill = Color.WHITE
        }

        controlBlock {
            padding = box(0.0.px)
            backgroundColor += mainColor
        }
        buttonFx {
            borderWidth += box(0.5.px)
            borderColor += box(mainColor)
            textFill = c(red = 220, green = 220, blue = 220)
            fontSize = 20.px
        }

        secondButton {
            backgroundColor += secondColor
        }
        numberButton {
            backgroundColor += numberColor
        }
        operationButton {
            backgroundColor += operationColor
        }
        clickedButton {
            backgroundColor += clickedColor
        }
    }
}
