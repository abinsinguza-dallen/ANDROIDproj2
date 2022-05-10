package com.myandroidapp.recipefoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    lateinit var btnOrder:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnOrder=findViewById(R.id.btnOrder)
        btnOrder.setOnClickListener {
            val intent=Intent(this,chooceAcakeActivity::class.java)
            startActivity(intent)
        }
    }
}