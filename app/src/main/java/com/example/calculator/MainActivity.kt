package com.example.calculator

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var input = "0"
    var input2 = ""
    var input1 = ""
    var result1 = 0.0
    var operacion = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var b9 = bt9.text.toString()
        var b8 = bt8.text.toString()
        var b7 = bt7.text.toString()
        var b6 = bt6.text.toString()
        var b5 = bt5.text.toString()
        var b4 = bt4.text.toString()
        var b3 = bt3.text.toString()
        var b2 = bt2.text.toString()
        var b1 = bt1.text.toString()
        var bpunto = btPunto.text.toString()
        var b0 = bt0.text.toString()
        var bigual = btIgual.text.toString()
        var bsum = btMas.text.toString()
        var bres = btMenos.text.toString()
        var bmult = btProducto.text.toString()
        var bdiv = btDivision.text.toString()

    }
    fun onClickButton(view:View){
        val mp = MediaPlayer.create(this,R.raw.sound)

        if (view is Button) {
            when (view.id) {
                R.id.bt0 ->{
                    mp.start()
                    if(input.startsWith("0")){
                        input = "0"
                    }else if(input.endsWith("+")||input.endsWith("-")||input.endsWith("*")||input.endsWith("/")){
                        input2 += "0"
                        tvResult.text = input+input2
                    }else{
                    input += "0"
                    tvResult.text = input}
                }
                R.id.bt1 ->{
                    mp.start()
                    if(input.startsWith("0")){
                        input = "1"
                        tvResult.text = input
                    }else if(input.endsWith("+")||input.endsWith("-")||input.endsWith("*")||input.endsWith("/")){
                        input2 += "1"
                        tvResult.text = input+input2
                    }else{
                    input += "1"
                    tvResult.text = input}
                }
                R.id.bt2 ->{
                    mp.start()
                    if(input.startsWith("0")){
                        input = "2"
                        tvResult.text = input
                    }else if(input.endsWith("+")||input.endsWith("-")||input.endsWith("*")||input.endsWith("/")){
                        input2 += "2"
                        tvResult.text = input+input2
                    }else{
                        input += "2"
                        tvResult.text = input}
                }
                R.id.bt3 ->{
                    mp.start()
                    if(input.startsWith("0")){
                        input = "3"
                        tvResult.text = input
                    }else if(input.endsWith("+")||input.endsWith("-")||input.endsWith("*")||input.endsWith("/")){
                        input2 += "3"
                        tvResult.text = input+input2
                    }else{
                        input += "3"
                        tvResult.text = input}
                }
                R.id.bt4 ->{
                    mp.start()
                    if(input.startsWith("0")){
                        input = "4"
                        tvResult.text = input
                    }else if(input.endsWith("+")||input.endsWith("-")||input.endsWith("*")||input.endsWith("/")){
                        input2 += "4"
                        tvResult.text = input+input2
                    }else{
                        input += "4"
                        tvResult.text = input}
                }
                R.id.bt5 ->{
                    mp.start()
                    if(input.startsWith("0")){
                        input = "5"
                        tvResult.text = input
                    }else if(input.endsWith("+")||input.endsWith("-")||input.endsWith("*")||input.endsWith("/")){
                        input2 += "5"
                        tvResult.text = input+input2
                    }else{
                        input += "5"
                        tvResult.text = input}
                }
                R.id.bt6 ->{
                    mp.start()
                    if(input.startsWith("0")){
                        input = "6"
                        tvResult.text = input
                    }else if(input.endsWith("+")||input.endsWith("-")||input.endsWith("*")||input.endsWith("/")){
                        input2 += "6"
                        tvResult.text = input+input2
                    }else{
                        input += "6"
                        tvResult.text = input}
                }
                R.id.bt7 ->{
                    mp.start()
                    if(input.startsWith("0")){
                        input = "7"
                        tvResult.text = input
                    }else if(input.endsWith("+")||input.endsWith("-")||input.endsWith("*")||input.endsWith("/")){
                        input2 += "7"
                        tvResult.text = input+input2
                    }else{
                        input += "7"
                        tvResult.text = input}
                }
                R.id.bt8 ->{
                    mp.start()
                    if(input.startsWith("0")){
                        input = "8"
                        tvResult.text = input
                    }else if(input.endsWith("+")||input.endsWith("-")||input.endsWith("*")||input.endsWith("/")){
                        input2 += "8"
                        tvResult.text = input+input2
                    }else{
                        input += "8"
                        tvResult.text = input}
                }
                R.id.bt9 ->{
                    mp.start()
                    if(input.startsWith("0")){
                        input = "9"
                        tvResult.text = input
                    }else if(input.endsWith("+")||input.endsWith("-")||input.endsWith("*")||input.endsWith("/")){
                        input2 += "9"
                        tvResult.text = input+input2
                    }else{
                        input += "9"
                        tvResult.text = input}
                }
                R.id.btPunto ->{
                    mp.start()
                    if(input.startsWith("0")){
                        input = "0."
                        tvResult.text = input
                    }else if(input.endsWith("+")||input.endsWith("-")||input.endsWith("*")||input.endsWith("/")){
                        input2 += "0."
                        tvResult.text = input+input2
                    }else{
                        input += "."
                        tvResult.text = input}
                }
                R.id.btMas ->{
                    mp.start()
                    operacion = 1
                    input1 = input
                    input += "+"
                    tvResult.text = input
                }
                R.id.btMenos ->{
                    mp.start()
                    operacion = 2
                    input1 = input
                    input += "-"
                    tvResult.text = input
                }
                R.id.btProducto ->{
                    mp.start()
                    operacion = 3
                    input1 = input
                    input += "*"
                    tvResult.text = input
                }
                R.id.btDivision ->{
                    mp.start()
                    operacion = 4
                    input1 = input
                    input += "/"
                    tvResult.text = input
                }
                R.id.btAc ->{
                    mp.start()
                    input = "0"
                    input2 = ""
                    input1 = ""
                    operacion = 0
                    result1 = 0.0
                    tvResult.text = input1

                }
                R.id.btIgual ->{
                    mp.start()
                    when(operacion){
                        1 ->{
                            result1 = (input1.toDouble())+(input2.toDouble())
                            tvResult.text = result1.toString()
                        }
                        2 ->{
                            result1 = (input1.toDouble())-(input2.toDouble())
                            tvResult.text = result1.toString()
                        }
                        3 ->{
                            result1 = (input1.toDouble())*(input2.toDouble())
                            tvResult.text = result1.toString()
                        }
                        4 ->{
                            result1 = (input1.toDouble())/(input2.toDouble())
                            tvResult.text = result1.toString()
                        }

                    }
                    input = "0"
                    input2 = ""
                    input1 = ""
                    operacion = 0
                    result1 = 0.0
                }
            }
        }
    }
}
