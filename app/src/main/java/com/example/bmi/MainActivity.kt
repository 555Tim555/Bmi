package com.example.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ed_weight   //取得合成元件(Synthetic property)kotlin
        ed_height
        b_calcula
        b_help

    }

    fun bmi(view:View){
        val weight = ed_weight.text.toString().toFloat()
        val height = ed_height.text.toString().toFloat()
        val BMI = weight/(height*height)
        Log.d("BMI",BMI.toString())
    }
}