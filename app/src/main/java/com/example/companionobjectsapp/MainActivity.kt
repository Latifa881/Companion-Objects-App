package com.example.companionobjectsapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var etChangeBackground: EditText
    lateinit var btChangeBackground: Button
    lateinit var llMain: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etChangeBackground = findViewById(R.id.etChangeBackground)
        btChangeBackground = findViewById(R.id.btChangeBackground)
        llMain = findViewById(R.id.llMain)

        btChangeBackground.setOnClickListener {
            val value = etChangeBackground.text.toString()
            etChangeBackground.setText("")
            val time = Time.name
            if (value.equals("Day", true)) {
               time.changeBackground(llMain, time.day)
                etChangeBackground.setTextColor(Color.BLACK)
                etChangeBackground.setHintTextColor(Color.GRAY)
            } else if (value.equals("Night", true)) {
                time.changeBackground(llMain, time.night)
                etChangeBackground.setTextColor(Color.WHITE)
                etChangeBackground.setHintTextColor(Color.DKGRAY)

            } else {
                Toast.makeText(this, "Enter Day or Night", Toast.LENGTH_SHORT).show()
            }

        }


    }


}



