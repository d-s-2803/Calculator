package com.example.calculator

class StringCalculator {
    fun calculate (calculationList: List<String>): Int {
        var currentOp = ""
        var currentNumber = 0

        calculationList.forEach { token ->

            when {
                token.equals("+")
                        || token.equals("-")
                        || token.equals("X")
                        || token.equals("/") -> currentOp = token

                currentOp.equals("-") -> currentNumber -= token.toInt()
                currentOp.equals("/") -> currentNumber /= token.toInt()
                currentOp.equals("X") -> currentNumber *= token.toInt()

                else -> currentNumber += token.toInt()
            }

        }

        return currentNumber
    }
}