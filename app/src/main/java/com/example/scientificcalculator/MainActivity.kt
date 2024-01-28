
package com.example.scientificcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var primaryTV: TextView
    lateinit var secondaryTV: TextView
    lateinit var acBtn: Button
    lateinit var cBtn: Button
    lateinit var brac1Btn: Button
    lateinit var brac2Btn: Button
    lateinit var sinBtn: Button
    lateinit var cosBtn: Button
    lateinit var tanBtn: Button
    lateinit var logBtn: Button
    lateinit var lnBtn: Button
    lateinit var factBtn: Button
    lateinit var sqrBtn: Button
    lateinit var rootBtn: Button
    lateinit var inverseBtn: Button
    lateinit var divBtn: Button
    lateinit var sevenBtn: Button
    lateinit var eightBtn: Button
    lateinit var nineBtn: Button
    lateinit var multyBtn: Button
    lateinit var fourBtn: Button
    lateinit var fiveBtn: Button
    lateinit var sixBtn: Button
    lateinit var minusBtn: Button
    lateinit var oneBtn: Button
    lateinit var twoBtn: Button
    lateinit var threeBtn: Button
    lateinit var plusBtn: Button
    lateinit var piBtn: Button
    lateinit var zeroBtn: Button
    lateinit var dotBtn: Button
    lateinit var equalBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        primaryTV = findViewById(R.id.idTVPrimary)
        secondaryTV = findViewById(R.id.idTVSecondary)
        acBtn = findViewById(R.id.idBtnAC)
        cBtn = findViewById(R.id.idBtnC)
        brac1Btn = findViewById(R.id.idBtnbrac1)
        brac2Btn = findViewById(R.id.idBtnbrac2)
        sinBtn = findViewById(R.id.idBtnSin)
        cosBtn = findViewById(R.id.idBtnCos)
        tanBtn = findViewById(R.id.idBtnTan)
        logBtn = findViewById(R.id.idBtnLog)
        lnBtn = findViewById(R.id.idBtnLn)
        factBtn = findViewById(R.id.idBtnfact)
        sqrBtn = findViewById(R.id.idBtnSqr)
        rootBtn = findViewById(R.id.idBtnRoot)
        inverseBtn = findViewById(R.id.idBtnInverse)
        divBtn = findViewById(R.id.idBtnDiv)
        sevenBtn = findViewById(R.id.idBtn7)
        eightBtn = findViewById(R.id.idBtn8)
        multyBtn = findViewById(R.id.idBtnX)
        nineBtn = findViewById(R.id.idBtn9)
        fourBtn = findViewById(R.id.idBtn4)
        fiveBtn = findViewById(R.id.idBtn5)
        sixBtn = findViewById(R.id.idBtn6)
        minusBtn = findViewById(R.id.idBtnMinus)
        oneBtn = findViewById(R.id.idBtn1)
        twoBtn = findViewById(R.id.idBtn2)
        threeBtn = findViewById(R.id.idBtn3)
        plusBtn = findViewById(R.id.idBtnPlus)
        piBtn = findViewById(R.id.idBtnN)
        zeroBtn = findViewById(R.id.idBtn0)
        dotBtn = findViewById(R.id.idBtnDot)
        equalBtn = findViewById(R.id.idBtnEqual)

        zeroBtn.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "0")

        }
        oneBtn.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "1")

        }
        twoBtn.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "2")

        }
        threeBtn.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "3")

        }
        fourBtn.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "4")

        }
        fiveBtn.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "5")

        }
        sixBtn.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "6")

        }
        sevenBtn.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "7")

        }
        eightBtn.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "8")

        }
        nineBtn.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "9")

        }
        dotBtn.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + ".")
        }
        plusBtn.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "+")
        }
        divBtn.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "÷")
        }
        brac1Btn.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "(")

        }
        brac2Btn.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + ")")

        }
        piBtn.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "3.142")
            secondaryTV.text = (piBtn.text.toString())
        }
        sinBtn.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "sin")
        }
        cosBtn.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "cos")
        }
        tanBtn.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "tan")
        }
        inverseBtn.setOnClickListener {
            if (primaryTV.text.toString().isEmpty()) {
                Toast.makeText(this, "please enter a valid number", Toast.LENGTH_SHORT).show()
            } else {
                val num: Int = primaryTV.text.toString().toInt()
                val inverse = calculateInverse(num)
                primaryTV.text = (primaryTV.text.toString() + "^"+"(-1)")
                secondaryTV.text = inverse.toString()
                primaryTV.text = inverse.toString()

            }
        }
        lnBtn.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "ln")
        }
        logBtn.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "log")
        }
        minusBtn.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "-")
        }
        multyBtn.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "*")
        }
        rootBtn.setOnClickListener {
            if (primaryTV.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_SHORT).show()
            } else {
                val str: String = primaryTV.text.toString()
                val result = Math.sqrt(str.toDouble())
                primaryTV.text = result.toString()
            }
        }
        acBtn.setOnClickListener {
            primaryTV.text = ""
            secondaryTV.text = ""
        }
        cBtn.setOnClickListener {
            var str: String = primaryTV.text.toString()
            if (!str.equals("")) {
                str = str.substring(0, str.length - 1)
                primaryTV.text = str
            }
        }
        sqrBtn.setOnClickListener {
            if (primaryTV.text.toString().isEmpty()) {
                Toast.makeText(this, "please enter a valid number", Toast.LENGTH_SHORT).show()
            } else {
                val d: Double = primaryTV.text.toString().toDouble()
                val square = d * d
                primaryTV.text = square.toString()
                secondaryTV.text = square.toString()
            }
        }
        factBtn.setOnClickListener {
            if (primaryTV.text.toString().isEmpty()) {
                Toast.makeText(this, "please enter a valid number", Toast.LENGTH_SHORT).show()
            } else {
                val value: Int = primaryTV.text.toString().toInt()
                val fact = factorial(value)
                primaryTV.text = (primaryTV.text.toString() + "!")
                secondaryTV.text = fact.toString()
                primaryTV.text = fact.toString()

            }
        }
        equalBtn.setOnClickListener {
            val str: String = primaryTV.text.toString()
            val result: Double = evaluate(str)
            val r = result.toString()
            primaryTV.text = r
            secondaryTV.text = str
        }

    }
    fun calculateInverse(number: Int): Double {
        if (number == 0.0.toInt()) {
            throw IllegalArgumentException("Cannot calculate the inverse of zero.")
        }
        return 1.0 / number
    }

    fun factorial(n: Int): Int {
        return if (n == 1 || n == 0) 1 else n * factorial(n - 1)
    }

    fun evaluate(str: String): Double {
        return object : Any() {
            var pos = -1
            var ch = 0
            fun nextChar() {
                ch = if (++pos < str.length) str[pos].code else -1
            }

            fun eat(charToEdt: Int): Boolean {
                while (ch == ' '.code) nextChar()
                if (ch == charToEdt) {
                    nextChar()
                    return true
                }
                return false
            }

            fun parse(): Double {
                nextChar()
                val x = parseExpression()
                if (pos < str.length) throw RuntimeException("Unexpected:" + ch.toChar())
                return x
            }

            fun parseExpression(): Double {
                var x = parseTerm()
                while (true) {
                    if (eat('+'.code)) x += parseTerm()
                    else if (eat('-'.code)) x -= parseTerm()
                    else return x
                }
            }

            fun parseTerm(): Double {
                var x = parseFactor()
                while (true) {
                    if (eat('*'.code)) x *= parseFactor()
                    else if (eat('÷'.code)) x /= parseFactor()
                    else return x
                }
            }

            fun parseFactor(): Double {
                if (eat('+'.code)) return parseFactor()
                if (eat('-'.code)) return parseFactor()

                var x: Double
                val startPos = pos

                if (eat('('.code)) {
                    x = parseExpression()
                    eat(')'.code)

                } else if (ch >= '0'.code && ch <= '9'.code) {
                    while (ch >= '0'.code && ch <= '9'.code || ch == '.'.code) nextChar()
                    x = str.substring(startPos, pos).toDouble()
                } else if (ch >= 'a'.code && ch <= 'z'.code) {
                    while (ch >= 'a'.code && ch <= 'z'.code) nextChar()
                    val func = str.substring(startPos, pos)
                    x = parseFactor()
                    if (func == "sqrt") {
                        x = Math.sqrt(x)
                    } else if (func == "sin") {
                        x = Math.sin(Math.toRadians(x))
                    } else if (func == "cos") {
                        x = Math.cos(Math.toRadians(x))
                    } else if (func == "tan") {
                        x = Math.tan(Math.toRadians(x))
                    } else if (func == "log") {
                        x = Math.log10(x)
                    } else if (func == "ln") {
                        x = Math.log(x)
                    }
                } else {
                    throw RuntimeException("Unexpected:" + ch.toChar())
                }
                if (eat('^'.code)) x = Math.pow(x, parseFactor())
                return x
            }
        }.parse()
    }
}