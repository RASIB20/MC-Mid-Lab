package com.example.mc_mid_lab

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)
        Handler().postDelayed({
            val homeintenet =  Intent(this,MainActivity::class.java)
            startActivity(homeintenet)
            finish()
        },10000)
    }
}