package com.kishore.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
//K:\MyCalculator2\app\build\outputs\apk\debug to see ths apk file
class MainActivity : AppCompatActivity() {

    private var in1 = 0.0
    private var i2 = 0.0
    private lateinit var edittext1: TextView
    private var Add = false
    private var Sub = false
    private var Multiply = false
    private var Divide = false
    private var Remainder = false
    private var deci = false
    private lateinit var button_0: Button
    private lateinit var button_1: Button
    private lateinit var button_2: Button
    private lateinit var button_3: Button
    private lateinit var button_4: Button
    private lateinit var button_5: Button
    private lateinit var button_6: Button
    private lateinit var button_7: Button
    private lateinit var button_8: Button
    private lateinit var button_9: Button
    private lateinit var button_Add: Button
    private lateinit var button_Sub: Button
    private lateinit var button_Mul: Button
    private lateinit var button_Div: Button
    private lateinit var button_Equ: Button
    private lateinit var button_Del: Button
    private lateinit var button_Dot: Button
    private lateinit var button_Remainder: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_0 = findViewById(R.id.b0)
        button_1 = findViewById(R.id.b1)
        button_2 = findViewById(R.id.b2)
        button_3 = findViewById(R.id.b3)
        button_4 = findViewById(R.id.b4)
        button_5 = findViewById(R.id.b5)
        button_6 = findViewById(R.id.b6)
        button_7 = findViewById(R.id.b7)
        button_8 = findViewById(R.id.b8)
        button_9 = findViewById(R.id.b9)
        button_Dot = findViewById(R.id.bDot)
        button_Add = findViewById(R.id.badd)
        button_Sub = findViewById(R.id.bsub)
        button_Mul = findViewById(R.id.bmul)
        button_Div = findViewById(R.id.biv)
        button_Remainder = findViewById(R.id.BRemain)
        button_Del = findViewById(R.id.buttonDel)
        button_Equ = findViewById(R.id.buttoneql)

        edittext1 = findViewById(R.id.display)

        button_1.setOnClickListener {
            edittext1.text = edittext1.text.toString() + "1"
        }

        button_2.setOnClickListener {
            edittext1.text = edittext1.text.toString() + "2"
        }

        button_3.setOnClickListener {
            edittext1.text = edittext1.text.toString() + "3"
        }

        button_4.setOnClickListener {
            edittext1.text = edittext1.text.toString() + "4"
        }

        button_5.setOnClickListener {
            edittext1.text = edittext1.text.toString() + "5"
        }

        button_6.setOnClickListener {
            edittext1.text = edittext1.text.toString() + "6"
        }

        button_7.setOnClickListener {
            edittext1.text = edittext1.text.toString() + "7"
        }

        button_8.setOnClickListener {
            edittext1.text = edittext1.text.toString() + "8"
        }

        button_9.setOnClickListener {
            edittext1.text = edittext1.text.toString() + "9"
        }

        button_0.setOnClickListener {
            edittext1.text = edittext1.text.toString() + "0"
        }

        button_Add.setOnClickListener {
            if (edittext1.text.isNotEmpty()) {
                in1 = edittext1.text.toString().toDouble()
                Add = true
                deci = false
                edittext1.text = null
            }
        }

        button_Sub.setOnClickListener {
            if (edittext1.text.isNotEmpty()) {
                in1 = edittext1.text.toString().toDouble()
                Sub = true
                deci = false
                edittext1.text = null
            }
        }

        button_Mul.setOnClickListener {
            if (edittext1.text.isNotEmpty()) {
                in1 = edittext1.text.toString().toDouble()
                Multiply = true
                deci = false
                edittext1.text = null
            }
        }

        button_Div.setOnClickListener {
            if (edittext1.text.isNotEmpty()) {
                in1 = edittext1.text.toString().toDouble()
                Divide = true
                deci = false
                edittext1.text = null
            }
        }

        button_Remainder.setOnClickListener {
            if (edittext1.text.isNotEmpty()) {
                in1 = edittext1.text.toString().toDouble()
                Remainder = true
                deci = false
                edittext1.text = null
            }
        }

        button_Equ.setOnClickListener {
            if (Add || Sub || Multiply || Divide || Remainder) {
                i2 = edittext1.text.toString().toDouble()
            }

            when {
                Add -> {
                    edittext1.text = (in1 + i2).toString()
                    Add = false
                }
                Sub -> {
                    edittext1.text = (in1 - i2).toString()
                    Sub = false
                }
                Multiply -> {
                    edittext1.text = (in1 * i2).toString()
                    Multiply = false
                }
                Divide -> {
                    edittext1.text = (in1 / i2).toString()
                    Divide = false
                }
                Remainder -> {
                    edittext1.text = (in1 % i2).toString()
                    Remainder = false
                }
            }
        }

        button_Del.setOnClickListener {
            edittext1.text = ""
            in1 = 0.0
            i2 = 0.0
        }

        button_Dot.setOnClickListener {
            if (!deci) {
                edittext1.text = edittext1.text.toString() + "."
                deci = true
            }
        }
    }
}
