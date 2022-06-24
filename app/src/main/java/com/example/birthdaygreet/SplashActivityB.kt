package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View

class SplashActivityB : AppCompatActivity() {
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_b)
        val nameb= intent.getStringExtra(BirthdayGreeting.Name_Extra)
            handler= Handler()
            handler.postDelayed({
                val intent= Intent(this,BirthdayGreeting::class.java)
                intent.putExtra(BirthdayGreeting.Name_Extra,nameb)
                startActivity(intent)
                finish()
            },2000)
    }
}