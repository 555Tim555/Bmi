package com.example.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        b_help.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("BMI說明")
                .setMessage("體重(kg)/身高的平方(m)")
                .setPositiveButton("OK",null)
                .show()
             }

    }

    fun bmi(view:View){
        val weight = ed_weight.text.toString().toFloat()
        val height = ed_height.text.toString().toFloat()
        val BMI = weight/(height*height)
        Log.d("BMI",BMI.toString())
        //Toast.makeText(this,BMI.toString(),Toast.LENGTH_LONG).show()
        AlertDialog.Builder(this)
            .setMessage(BMI.toString())
            .setTitle("Your BMI")
            .setPositiveButton("OK",null)
            .setNeutralButton("CANCEL",null)
            .show()
    }
}