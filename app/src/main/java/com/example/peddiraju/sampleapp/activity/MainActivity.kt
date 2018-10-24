package com.example.peddiraju.sampleapp.activity

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import com.example.peddiraju.sampleapp.R
import com.example.peddiraju.sampleapp.R.id.button
import com.example.peddiraju.sampleapp.R.id.button2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // button is the Button id
        button!!.setOnClickListener {
            startActivity(Intent(applicationContext, ScreenOne::class.java))
        }

        // button is the Button id
        button2!!.setOnClickListener {
            startActivity(Intent(applicationContext, ScreenTwo::class.java))
        }
    }
}
