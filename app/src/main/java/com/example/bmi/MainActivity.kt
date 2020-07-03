package com.example.bmi

import android.content.Intent
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
        Log.d("MainActivity","onCreate")

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
        var BMI : Float = 0f
        BMI = weight/(height*height)
        Log.d("BMI",BMI.toString())
        //傳遞多種資料
        Intent(this,ResultActivity::class.java).apply {
            val bag = Bundle()
            bag.putFloat(getString(R.string.bmi_extra),BMI)
            bag.putString("TEST","testing")
            putExtras(bag)
            startActivity(this)
        }


        //傳遞單一資料
        /*Intent(this,ResultActivity::class.java).apply {
            putExtra("BMI_EXTRA",BMI)
            startActivity(this)
        }*/

        //val intent = Intent(this,ResultActivity::class.java)
        //startActivity(intent)

        //Toast.makeText(this,BMI.toString(),Toast.LENGTH_LONG).show()
        /*AlertDialog.Builder(this)
            .setMessage(BMI.toString())
            .setTitle("Your BMI")
            .setPositiveButton("OK",null)
            .setNeutralButton("CANCEL",null)
            .show()*/
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity","onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity","onDestroy")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity","onStop")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity","onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity","onRestart")
    }
}