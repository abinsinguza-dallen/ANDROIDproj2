package com.myandroidapp.recipefoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WeddingActivity : AppCompatActivity() {
    lateinit var btnwedorders:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wedding)
        btnwedorders=findViewById(R.id.btnwedorders)
        btnwedorders.setOnClickListener {
            val intent=Intent(this,MakeOrdersActivity::class.java)
            startActivity(intent)
        }
    }
}