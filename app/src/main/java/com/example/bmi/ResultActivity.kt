package com.example.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        //接收多筆資料

        val bmi = intent.extras?.getFloat("BMI_EXTRA")
        result.setText(bmi.toString())
        val Test = intent.extras?.getString("TEST")
        test.setText(Test)
        //接收單筆資料
        /*val bmi = intent.getFloatExtra("BMI_EXTRA",0f)
        result.setText(bmi.toString())*/
    }
}