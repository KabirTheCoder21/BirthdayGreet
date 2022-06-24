package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.birthdaygreet.BirthdayGreeting.Companion.Name_Extra

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun create(view: View) {
        var input=findViewById<EditText>(R.id.input)
        var name=input.editableText.toString()
        if(!name.isEmpty()) {
            //Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, SplashActivityB::class.java)
           intent.putExtra(BirthdayGreeting.Name_Extra,name)
            startActivity(intent)
        }
        else{
            Toast.makeText(this,"Please Enter the name.",Toast.LENGTH_SHORT).show()
        }
        input.setText("  ")
    }

}