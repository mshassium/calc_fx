package org.mshassium.tornado_fx.view

import tornadofx.*

class CalculatorView : View("FXCalculator") {
    override val root = borderpane {
        top = textfield {
            filterInput { it.controlNewText.isInt() }
        }
        center = flowpane {
            button("AC")
            button("±")
            button("%")
            button("÷")
            button("7")
            button("8")
            button("9")
            button("х")
            button("4")
            button("5")
            button("6")
            button("-")
            button("1")
            button("2")
            button("3")
            button("+")
            button("0")
            button(",")
            button("=")
        }
    }
}
