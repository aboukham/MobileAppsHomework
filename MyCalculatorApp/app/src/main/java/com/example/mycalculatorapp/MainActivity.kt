package com.example.mycalculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    fun computeCalculator(view: View){
        val firstNum = Integer.parseInt(findViewById<EditText>(R.id.firstText).toString())
        val secondNum = Integer.parseInt(findViewById<EditText>(R.id.secondText).toString())
        var result = findViewById<TextView>(R.id.resultText)
        var res : Int? = 0
        when(view.id){
            R.id.addition ->  res = firstNum + secondNum
            R.id.substraction ->  res = firstNum - secondNum
            R.id.multiplication ->  res = firstNum * secondNum
            R.id.division -> try {
                res = firstNum / secondNum
            } catch (e: Exception){
                res = null
            }
        }
        result.text = res.toString()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}