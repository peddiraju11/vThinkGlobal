package com.example.peddiraju.sampleapp.activity

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import com.example.peddiraju.sampleapp.R

class SplashActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // For hiding title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash)

        val background = object : Thread() {
            override fun run() {
                Thread.sleep((1 * 2000).toLong())
                startActivity(Intent(applicationContext, MainActivity::class.java))
                finish()
            }
        }

        background.start()
    }

}
