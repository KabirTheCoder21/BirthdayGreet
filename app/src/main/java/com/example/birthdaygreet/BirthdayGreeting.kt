package com.example.birthdaygreet

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayGreeting : AppCompatActivity() {
    companion object{
        const val Name_Extra="name_extra"
    }
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)
        val name=intent.getStringExtra(Name_Extra)
        val result=findViewById<TextView>(R.id.result)
        result.text="Happy Birthday\n$name!"
    }
}