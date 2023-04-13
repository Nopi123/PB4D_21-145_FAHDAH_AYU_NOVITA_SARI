package com.example.modul1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun onMatch(view: View){
        val textuser = findViewById<EditText>(R.id.user)
        val textpas = findViewById<EditText>(R.id.pass)
        val textTitle = findViewById<TextView>(R.id.textView)

        if (textuser.text.toString() == "fahdahayu" && textpas.text.toString() == "fahdah123"){
            Toast.makeText(this,"Login Successfully", Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText( this,"Login Failed", Toast.LENGTH_SHORT).show()
        }
    }
}