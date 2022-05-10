package com.myandroidapp.recipefoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnorders:Button
    lateinit var btnLogin:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnorders=findViewById(R.id.btnorders)
        btnorders.setOnClickListener {
            val intent = Intent(this,createAccountActivity::class.java)
            startActivity(intent)
        }
           btnLogin=findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener {
            val intent =Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}